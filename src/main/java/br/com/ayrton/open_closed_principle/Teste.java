package br.com.ayrton.open_closed_principle;

import br.com.ayrton.open_closed_principle.enums.TipoFuncionario;
import br.com.ayrton.open_closed_principle.modelo.Funcionario;
import br.com.ayrton.open_closed_principle.service.CalculaSalario;
import br.com.ayrton.open_closed_principle.service.CalculaSalarioAnalista;
import br.com.ayrton.open_closed_principle.service.CalculaSalarioArquiteto;

public class Teste {
    public static void main(String[] args) {
        CalculaSalarioAnalista csa = new CalculaSalarioAnalista();
        CalculaSalarioArquiteto csarq = new CalculaSalarioArquiteto();
        CalculaSalario c = new CalculaSalario(csa,csarq);

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
