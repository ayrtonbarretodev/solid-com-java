package br.com.ayrton.solid_example_interface_segregation_principle;

import br.com.ayrton.solid_example_interface_segregation_principle.service.Anuenio;
import br.com.ayrton.solid_example_interface_segregation_principle.service.Promocao;

import java.math.BigDecimal;

public class Teste {
    public static void main(String[] args) {
        Anuenio anuenio = new Anuenio(new BigDecimal("150"));
        Promocao promocao = new Promocao(new BigDecimal("100"));

        BigDecimal v = promocao.valorImpostoDeRenda();

        System.out.println("Valor do Imposto de Renda");
        System.out.println(v);

        System.out.println();

        System.out.println("Anuenio: " + anuenio);
        System.out.println();
        System.out.println("Promoção: " + promocao);
    }
}
