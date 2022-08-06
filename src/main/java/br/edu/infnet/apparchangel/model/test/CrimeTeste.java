package br.edu.infnet.apparchangel.model.test;

import br.edu.infnet.apparchangel.model.domain.Crime;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class CrimeTeste implements ApplicationRunner {
    @Override
    public void run(ApplicationArguments args) throws Exception {
        System.out.println("#Crime");
        Crime c1 = new Crime();
        c1.armaBranca = true;
        c1.armaDeFogo = false;
        c1.nrSuspeitos = 1;
        c1.nrVitimas = 2;
        System.out.println(c1);

        Crime c2 = new Crime();
        c2.armaBranca = true;
        c2.armaDeFogo = true;
        c2.nrSuspeitos = 5;
        c2.nrVitimas = 10;
        System.out.println(c2);

        Crime c3 = new Crime();
        c3.armaBranca = false;
        c3.armaDeFogo = false;
        c3.nrSuspeitos = 1;
        c3.nrVitimas = 0;
        System.out.println(c3);
    }
}
