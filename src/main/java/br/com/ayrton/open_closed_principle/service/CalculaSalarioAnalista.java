package br.com.ayrton.open_closed_principle.service;

import br.com.ayrton.open_closed_principle.enums.TipoFuncionario;
import br.com.ayrton.open_closed_principle.modelo.Funcionario;

import java.math.BigDecimal;

public class CalculaSalarioAnalista implements CalculaSalarioBase{
    @Override
    public void calculaSalario(Funcionario f) {
        if (f.getTipoFuncionario() == TipoFuncionario.ANALISTA) {
            f.adicionarSalario(7000);
        }
    }
}
