package br.com.ayrton.solid.model;

import lombok.Getter;
import lombok.Setter;
@Setter
@Getter
public class Terceirizado{
    private DadosPessoais dadosPessoais;
    private String empresa;

    public Terceirizado(DadosPessoais dadosPessoais, String empresa) {
        this.dadosPessoais = dadosPessoais;
        this.empresa = empresa;
    }
}
