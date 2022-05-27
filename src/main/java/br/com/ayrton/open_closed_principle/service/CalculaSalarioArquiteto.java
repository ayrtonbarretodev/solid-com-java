package br.com.ayrton.open_closed_principle.service;

import br.com.ayrton.open_closed_principle.enums.TipoFuncionario;
import br.com.ayrton.open_closed_principle.modelo.Funcionario;

import java.math.BigDecimal;

public class CalculaSalarioArquiteto implements CalculaSalarioBase{
    @Override
    public void calculaSalario(Funcionario f) {
        if (f.getTipoFuncionario() == TipoFuncionario.ARQUITETO){
            f.adicionarSalario(5000);
        }
    }
}
