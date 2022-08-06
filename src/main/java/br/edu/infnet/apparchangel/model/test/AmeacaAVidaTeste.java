package br.edu.infnet.apparchangel.model.test;

import br.edu.infnet.apparchangel.model.domain.AmeacaAVida;
import br.edu.infnet.apparchangel.model.domain.Emergencia;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Component
public class AmeacaAVidaTeste implements ApplicationRunner {

    @Override
    public void run(ApplicationArguments args) throws Exception {
        System.out.println("#AmeacaAVida");
        AmeacaAVida a1 = new AmeacaAVida();
        a1.statusVitima = new ArrayList<String>();
        a1.statusVitima.add("Acordada");
        a1.nrVitima = 3;
        a1.tipoFerimento = "Fratura exposta";
        System.out.println(a1);

        AmeacaAVida a2 = new AmeacaAVida();
        a2.statusVitima = new ArrayList<String>();
        a2.statusVitima.add("Em Choque");
        a2.nrVitima = 2;
        a2.tipoFerimento = "Hemorragia";
        System.out.println(a2);

        AmeacaAVida a3 = new AmeacaAVida();
        a3.statusVitima = new ArrayList<String>();
        a3.statusVitima.add("Estável");
        a3.nrVitima = 1;
        a3.tipoFerimento = "Escoriações";
        System.out.println(a3);
    }

}
