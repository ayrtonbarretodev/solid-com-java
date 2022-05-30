package br.com.ayrton.solid_example_interface_segregation_principle.interfaces;

import java.math.BigDecimal;
import java.time.LocalDate;

public interface IReajuste {

    BigDecimal valor();

    LocalDate data();
}
