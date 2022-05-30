package br.com.ayrton.solid_example_interface_segregation_principle.service;

import br.com.ayrton.solid_example_interface_segregation_principle.interfaces.IReajuste;
import lombok.ToString;

import java.math.BigDecimal;
import java.time.LocalDate;
@ToString
public class Anuenio implements IReajuste {

    private BigDecimal valor;
    private LocalDate data;

    public Anuenio(BigDecimal valor) {
        this.valor = valor;
        this.data = LocalDate.now();
    }

    @Override
    public BigDecimal valor() {
        return valor;
    }

    @Override
    public LocalDate data() {
        return data;
    }
}
