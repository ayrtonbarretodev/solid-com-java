package br.com.ayrton.solid_exemplo_dependency_inversion_principle.modelo;

import br.com.ayrton.solid_exemplo_dependency_inversion_principle.interfaces.ILeitorArquivo;

public class LeitorPdf implements ILeitorArquivo {
    @Override
    public void ler(String caminho) {
        System.out.println("Lendo arquivo pdf");
    }
}
