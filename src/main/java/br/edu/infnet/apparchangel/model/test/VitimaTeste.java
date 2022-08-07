package br.edu.infnet.apparchangel.model.test;

import br.edu.infnet.apparchangel.model.domain.Vitima;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class VitimaTeste implements ApplicationRunner {

    @Override
    public void run(ApplicationArguments args) throws Exception {
        System.out.println("#Vítima");
        Vitima v1 = new Vitima("Fernanda", "Josélia", "25");
        System.out.println(v1);

        Vitima v2 = new Vitima("Sandra", "Roberta", "42");
        System.out.println(v2);

        Vitima v3 = new Vitima("Carlos", "Brenda","18");
        System.out.println(v3);
    }
}
