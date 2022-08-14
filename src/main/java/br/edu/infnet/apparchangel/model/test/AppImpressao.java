package br.edu.infnet.apparchangel.model.test;

import br.edu.infnet.apparchangel.interfaces.IPrinter;
import br.edu.infnet.apparchangel.model.domain.Crise;

public class AppImpressao {
    //Feature 4 - Finalizada
    public static void relatorio(IPrinter printer, String mensagem){
        System.out.println();
        System.out.println(mensagem);
        printer.impressao();
    }
}
