package br.com.ayrton.solid.service;

import br.com.ayrton.solid.model.Funcionario;

import java.math.BigDecimal;

public interface ValidacaoReajuste {
    void validar(Funcionario funcionario, BigDecimal aumento);
}
