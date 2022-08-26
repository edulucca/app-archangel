package br.edu.infnet.apparchangel.model.test;

import br.edu.infnet.apparchangel.controller.RequisitanteController;
import br.edu.infnet.apparchangel.model.domain.Requisitante;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class RequisitanteTeste implements ApplicationRunner {

    @Override
    public void run(ApplicationArguments args) {

        try {
            Requisitante r1 = new Requisitante("Fernando Quintana","888.888.888-88", "61998738368");
            RequisitanteController.incluir(r1);
        } catch (Exception e) {
            System.out.println("[ERROR] " + e.getMessage());
        }

        try {
            Requisitante r2 = new Requisitante("Diego Monteiro", "777.888.888-88", "61965417532");
            RequisitanteController.incluir(r2);
        } catch (Exception e) {
            System.out.println("[ERROR] " + e.getMessage());
        }

        try {
            Requisitante r3 = new Requisitante("Pedro Henrique", "777.666.888-88", "61957327863");
            RequisitanteController.incluir(r3);
        } catch (Exception e) {
            System.out.println("[ERROR] " + e.getMessage());
        }
        try {
            Requisitante r2 = new Requisitante("Rafael Andrade", "", "61965417532");
            RequisitanteController.incluir(r2);
        } catch (Exception e) {
            System.out.println("[ERROR] " + e.getMessage());
        }

        try {
            Requisitante r3 = new Requisitante("Gabriel Ferreira", null, "61957327863");
            RequisitanteController.incluir(r3);
        } catch (Exception e) {
            System.out.println("[ERROR] " + e.getMessage());
        }

    }
}
