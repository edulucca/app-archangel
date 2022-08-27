package br.edu.infnet.apparchangel.model.test;

import br.edu.infnet.apparchangel.controller.PatrimonioController;
import br.edu.infnet.apparchangel.model.domain.Patrimonio;
import br.edu.infnet.apparchangel.model.exception.EscalaDeRiscoMaiorQueTresException;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class PatrimonioTeste implements ApplicationRunner {

    @Override
    public void run(ApplicationArguments args){


        try {
            Patrimonio p1 = new Patrimonio(2,"Carro", "Fogo");
            p1.setEscalaDeRisco(1);
            System.out.println(p1.definirEscalaDeRisco());
            PatrimonioController.incluir(p1);
        } catch (EscalaDeRiscoMaiorQueTresException e) {
            System.out.println("[ERROR - PATRIMONIO] " + e.getMessage());
        }

        try {
            Patrimonio p2 = new Patrimonio(1,"Casa", "Praga");
            p2.setEscalaDeRisco(2);
            System.out.println(p2.definirEscalaDeRisco());
            PatrimonioController.incluir(p2);
        } catch (EscalaDeRiscoMaiorQueTresException e) {
            System.out.println("[ERROR - PATRIMONIO] " + e.getMessage());
        }

        try {
            Patrimonio p3 = new Patrimonio(3,"Comercio", "Força Física");
            p3.setEscalaDeRisco(3);
            System.out.println(p3.definirEscalaDeRisco());
            PatrimonioController.incluir(p3);
        } catch (EscalaDeRiscoMaiorQueTresException e) {
            System.out.println("[ERROR - PATRIMONIO] " + e.getMessage());
        }


        try {
            Patrimonio p3 = new Patrimonio(3,"Comercio", "Força Física");
            p3.setEscalaDeRisco(3);
            System.out.println(p3.definirEscalaDeRisco());
            PatrimonioController.incluir(p3);
        } catch (EscalaDeRiscoMaiorQueTresException e) {
            System.out.println("[ERROR - PATRIMONIO] " + e.getMessage());
        }

        try {
            Patrimonio p4 = new Patrimonio(3,"Comercio", "Força Física");
            p4.setEscalaDeRisco(4);
            System.out.println(p4.definirEscalaDeRisco());
            PatrimonioController.incluir(p4);
        } catch (EscalaDeRiscoMaiorQueTresException e) {
            System.out.println("[ERROR - PATRIMONIO] " + e.getMessage());
        }
    }
}
