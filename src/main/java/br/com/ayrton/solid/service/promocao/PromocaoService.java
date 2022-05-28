package br.com.ayrton.solid.service.promocao;

import br.com.ayrton.solid.enums.Cargo;
import br.com.ayrton.solid.exception.ValidacaoException;
import br.com.ayrton.solid.model.Funcionario;

public class PromocaoService {

    public void promover(Funcionario f, boolean metaBatida) {
        Cargo cargoAtual = f.getCargo();

        if (cargoAtual == Cargo.GERENTE) {
            throw new ValidacaoException("Gerentes não podem ser promovidos");
        }

        if (!metaBatida) {
            throw new ValidacaoException("Funcionário não bateu a meta");
        }

        Cargo novoCargo = cargoAtual.getProximoCargo();
        f.promover(novoCargo);
    }
}
