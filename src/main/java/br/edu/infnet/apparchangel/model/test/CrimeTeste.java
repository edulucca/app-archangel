package br.edu.infnet.apparchangel.model.test;

import br.edu.infnet.apparchangel.model.domain.Crime;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class CrimeTeste implements ApplicationRunner {
    @Override
    public void run(ApplicationArguments args) throws Exception {
        AppEmergencia app = new AppEmergencia("CRIME OCORRENDO NESTE MOMENTO");
        Crime c1 = new Crime(2, 1, true, false);
        app.relatorio(c1);

        System.out.println(c1);

        Crime c2 = new Crime(10, 5, true, true);
        System.out.println(c2);

        Crime c3 = new Crime(0,1, false, false);
        System.out.println(c3);
    }
}
