package br.com.ayrton.open_closed_principle.service;

import br.com.ayrton.open_closed_principle.modelo.Funcionario;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.List;

@Getter
@NoArgsConstructor
public class CalculaSalario {
    private List<CalculaSalarioBase> validacoes;

    public CalculaSalario(List<CalculaSalarioBase> validacoes) {
        this.validacoes = validacoes;
    }

    public void calcularSalario(Funcionario f){
        this.validacoes.forEach(calculaSalarioBase -> calculaSalarioBase.calculaSalario(f));
    }

}
