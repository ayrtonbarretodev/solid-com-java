package br.com.ayrton.open_closed_principle;

import br.com.ayrton.open_closed_principle.enums.TipoFuncionario;
import br.com.ayrton.open_closed_principle.modelo.Funcionario;
import br.com.ayrton.open_closed_principle.service.CalculaSalario;
import br.com.ayrton.open_closed_principle.service.CalculaSalarioAnalista;
import br.com.ayrton.open_closed_principle.service.CalculaSalarioArquiteto;
import br.com.ayrton.open_closed_principle.service.CalculaSalarioBase;

import java.util.ArrayList;
import java.util.List;

public class Teste {
    public static void main(String[] args) {

        CalculaSalarioAnalista csa = new CalculaSalarioAnalista();
        CalculaSalarioArquiteto csarq = new CalculaSalarioArquiteto();

        List<CalculaSalarioBase>calculaSalarioBases = new ArrayList<>();
        calculaSalarioBases.add(csa);
        calculaSalarioBases.add(csarq);

        CalculaSalario c = new CalculaSalario(calculaSalarioBases);

        Funcionario fAnalista = new Funcionario();
        fAnalista.setTipoFuncionario(TipoFuncionario.ANALISTA);
        c.calcularSalario(fAnalista);
        System.out.println(fAnalista.getSalario());

        System.out.println();

        Funcionario fArquiteto = new Funcionario();
        fArquiteto.setTipoFuncionario(TipoFuncionario.ARQUITETO);
        c.calcularSalario(fArquiteto);
        System.out.println(fArquiteto.getSalario());



    }
}
