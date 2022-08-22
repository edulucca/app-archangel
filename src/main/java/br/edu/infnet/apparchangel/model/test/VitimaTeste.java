package br.edu.infnet.apparchangel.model.test;

import br.edu.infnet.apparchangel.controller.VitimaController;
import br.edu.infnet.apparchangel.model.domain.Vitima;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class VitimaTeste implements ApplicationRunner {

    @Override
    public void run(ApplicationArguments args) throws Exception {
        Vitima v1 = new Vitima("Fernanda", "Josélia", "25");
        VitimaController.incluir(v1);

        Vitima v2 = new Vitima("Sandra", "Roberta", "42");
        VitimaController.incluir(v2);

        Vitima v3 = new Vitima("Carlos", "Brenda","18");
        VitimaController.incluir(v3);
    }
}
