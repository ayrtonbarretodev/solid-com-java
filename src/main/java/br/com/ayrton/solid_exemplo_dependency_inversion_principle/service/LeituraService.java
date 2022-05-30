package br.com.ayrton.solid_exemplo_dependency_inversion_principle.service;

import br.com.ayrton.solid_exemplo_dependency_inversion_principle.interfaces.ILeitorArquivo;

public class LeituraService {
    private ILeitorArquivo leitorArquivo;

    public LeituraService(ILeitorArquivo leitorArquivo) {
        this.leitorArquivo = leitorArquivo;
    }

    public void ler() {
        leitorArquivo.ler("C:\temp\teste.txt");
    }

}
