package br.com.ayrton.solid.service.reajuste;

import br.com.ayrton.solid.exception.ValidacaoException;
import br.com.ayrton.solid.model.Funcionario;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class ValidacaoPercentualReajuste implements ValidacaoReajuste{

    private static final BigDecimal PERCENTUAL_MAXIMO_REAJUSTE = new BigDecimal("0.4");
    public void validar(Funcionario funcionario, BigDecimal aumento) {
        BigDecimal salarioAtual = funcionario.getSalario();
        BigDecimal percentualReajuste = aumento.divide(salarioAtual, RoundingMode.HALF_UP);
        if (percentualReajuste.compareTo(PERCENTUAL_MAXIMO_REAJUSTE) > 0) {
            throw new ValidacaoException("Reajuste nao pode ser superior a 40% do salario!");
        }
    }
}
