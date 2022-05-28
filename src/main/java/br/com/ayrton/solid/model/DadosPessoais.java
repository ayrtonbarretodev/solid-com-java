package br.com.ayrton.solid.model;

import br.com.ayrton.solid.enums.Cargo;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Setter
public class DadosPessoais {
    private String nome;
    private String cpf;
    private Cargo cargo;
    private BigDecimal salario;
}
