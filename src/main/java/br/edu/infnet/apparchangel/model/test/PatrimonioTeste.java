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
        Patrimonio p1 = new Patrimonio();
        p1.nrPatrimonio = 2;
        p1.agenteDeRisco = "Fogo";
        p1.tipo = "Carro";
        System.out.println(p1);

        Patrimonio p2 = new Patrimonio();
        p2.nrPatrimonio = 1;
        p2.agenteDeRisco = "Praga";
        p2.tipo = "Casa";
        System.out.println(p2);

        Patrimonio p3 = new Patrimonio();
        p3.nrPatrimonio = 3;
        p3.agenteDeRisco = "Força Física";
        p3.tipo = "Comércio";
        System.out.println(p3);
    }
}
