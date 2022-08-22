package br.edu.infnet.apparchangel.model.test;

import br.edu.infnet.apparchangel.controller.PatrimonioController;
import br.edu.infnet.apparchangel.model.domain.Patrimonio;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class PatrimonioTeste implements ApplicationRunner {

    @Override
    public void run(ApplicationArguments args) throws Exception {
        Patrimonio p1 = new Patrimonio(2,"Carro", "Fogo");
        PatrimonioController.incluir(p1);

        Patrimonio p2 = new Patrimonio(1,"Casa", "Praga");
        PatrimonioController.incluir(p2);

        Patrimonio p3 = new Patrimonio(3,"Comercio", "Força Física");
        PatrimonioController.incluir(p3);
    }
}
