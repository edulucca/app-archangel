package br.edu.infnet.apparchangel.model.test;

import br.edu.infnet.apparchangel.model.domain.Patrimonio;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class PatrimonioTeste implements ApplicationRunner {

    @Override
    public void run(ApplicationArguments args) throws Exception {
        Patrimonio p1 = new Patrimonio(2,"Carro", "Fogo");
        AppImpressao.relatorio(p1, "PATRIMONIO EM RISCO NESTE MOMENTO");

        Patrimonio p2 = new Patrimonio(1,"Casa", "Praga");
        System.out.println(p2);

        Patrimonio p3 = new Patrimonio(3,"Comercio", "Força Física");
        System.out.println(p3);
    }
}
