package br.com.ayrton.solid_example_interface_segregation_principle.service;

import br.com.ayrton.solid_example_interface_segregation_principle.interfaces.IReajusteTributavel;
import lombok.ToString;

import java.math.BigDecimal;
import java.time.LocalDate;
@ToString
public class Promocao implements IReajusteTributavel {
    private BigDecimal valor;
    private LocalDate data;
    private static final BigDecimal PERCENTUAL_IMPOSTO_RENDA = new BigDecimal("0.1");

    public Promocao(BigDecimal valor) {
        this.valor = valor;
        this.data = LocalDate.now();
    }

    @Override
    public BigDecimal valor() {
        return null;
    }

    @Override
    public LocalDate data() {
        return null;
    }

    @Override
    public BigDecimal valorImpostoDeRenda() {
        return valor.multiply(PERCENTUAL_IMPOSTO_RENDA);
    }
}
