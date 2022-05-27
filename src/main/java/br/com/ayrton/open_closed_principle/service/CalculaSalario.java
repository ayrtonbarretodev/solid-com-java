package br.com.ayrton.open_closed_principle.service;

import br.com.ayrton.open_closed_principle.enums.TipoFuncionario;
import br.com.ayrton.open_closed_principle.modelo.Funcionario;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class CalculaSalario {
    //private double fValorSalario;

    private CalculaSalarioAnalista calculaSalarioAnalista;
    private CalculaSalarioArquiteto calculaSalarioArquiteto;


    public CalculaSalario(CalculaSalarioAnalista calculaSalarioAnalista, CalculaSalarioArquiteto calculaSalarioArquiteto) {
        this.calculaSalarioAnalista = calculaSalarioAnalista;
        this.calculaSalarioArquiteto = calculaSalarioArquiteto;
    }

    public void calcularSalario(Funcionario f){
        calculaSalarioAnalista.calculaSalario(f);
        calculaSalarioArquiteto.calculaSalario(f);
    }

}
