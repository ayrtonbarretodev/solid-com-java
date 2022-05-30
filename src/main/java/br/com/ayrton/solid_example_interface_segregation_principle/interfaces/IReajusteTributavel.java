package br.com.ayrton.solid_example_interface_segregation_principle.interfaces;

import java.math.BigDecimal;

public interface IReajusteTributavel extends IReajuste{
    BigDecimal valorImpostoDeRenda();
}
