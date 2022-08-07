package br.edu.infnet.apparchangel.model.test;

import br.edu.infnet.apparchangel.model.domain.Patrimonio;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class PatrimonioTeste implements ApplicationRunner {

    @Override
    public void run(ApplicationArguments args) throws Exception {
        System.out.println("#Patrimonio");
        Patrimonio p1 = new Patrimonio(2,"Carro", "Fogo");
        System.out.println(p1);

        Patrimonio p2 = new Patrimonio(1,"Casa", "Praga");
        System.out.println(p2);

        Patrimonio p3 = new Patrimonio(3,"Comercio", "Força Física");
        System.out.println(p3);
    }
}
