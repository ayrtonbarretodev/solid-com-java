package br.com.ayrton.solid_exemplo_dependency_inversion_principle;

import br.com.ayrton.solid_exemplo_dependency_inversion_principle.service.LeituraService;
import br.com.ayrton.solid_exemplo_dependency_inversion_principle.modelo.LeitorExcel;
import br.com.ayrton.solid_exemplo_dependency_inversion_principle.modelo.LeitorPdf;

public class Teste {
    public static void main(String[] args) {
        LeitorExcel leitorExcel = new LeitorExcel();
        LeituraService t1 = new LeituraService(leitorExcel);
        t1.ler();

        System.out.println();

        LeitorPdf leitorPdf = new LeitorPdf();
        LeituraService t2 = new LeituraService(leitorPdf);
        t2.ler();
    }
}
