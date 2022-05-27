package br.com.ayrton.open_closed_principle.modelo;

import br.com.ayrton.open_closed_principle.enums.TipoFuncionario;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Funcionario {
    private TipoFuncionario tipoFuncionario;
    private double salario = 0;

    public void adicionarSalario(double valor){
        this.salario+=valor;
    }
}
