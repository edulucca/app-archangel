package br.edu.infnet.apparchangel.model.service;

import br.edu.infnet.apparchangel.model.domain.app.Projeto;
import br.edu.infnet.apparchangel.model.test.AppImpressao;
import org.springframework.stereotype.Service;

@Service
public class AppService {
    private Projeto projeto;

    public void incluir(Projeto projeto){
        this.projeto = projeto;

        AppImpressao.relatorio(projeto, "Exibição do Projeto " + projeto.getNome() + " realizada com sucesso!!!");
    }

    public Projeto obterProjeto(){
        return projeto;
    }
}
