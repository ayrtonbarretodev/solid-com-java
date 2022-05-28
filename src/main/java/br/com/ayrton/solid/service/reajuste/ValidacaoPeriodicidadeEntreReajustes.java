package br.com.ayrton.solid.service;

import br.com.ayrton.solid.exception.ValidacaoException;
import br.com.ayrton.solid.model.Funcionario;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class ValidacaoPeriodicidadeEntreReajustes implements ValidacaoReajuste{

    public void validar(Funcionario funcionario, BigDecimal aumento) {
        LocalDate dataUltimoReajusteReajuste = funcionario.getDataUltimoReajuste();
        LocalDate dataAtual = LocalDate.now();
        long mesesDesdeUltimoReajuste = ChronoUnit.MONTHS.between(dataUltimoReajusteReajuste,dataAtual);

        if (mesesDesdeUltimoReajuste<6) {
            throw new ValidacaoException("Intervalo entre reajustes deve ser no mínimo 6 meses!");
        }
    }
}
