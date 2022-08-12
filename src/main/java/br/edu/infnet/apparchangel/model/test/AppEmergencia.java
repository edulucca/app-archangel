package br.edu.infnet.apparchangel.model.test;

import br.edu.infnet.apparchangel.model.domain.Crise;

public class AppEmergencia {
    private String mensagem;

    public AppEmergencia(String mensagem){
        this.mensagem = mensagem;
    }

    public void relatorio(Crise inCrise){
        System.out.println();
        System.out.println(mensagem);
        inCrise.impressao();
    }
}
