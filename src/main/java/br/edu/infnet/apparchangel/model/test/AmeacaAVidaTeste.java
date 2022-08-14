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
        
        AmeacaAVida a1 = new AmeacaAVida(3, "Fratura exposta", new ArrayList<String>());
        a1.getStatusVitima().add("Acordada");
        AppImpressao.relatorio(a1, "ATENCAO!!! EMERGENCIA INICIADA!");


        AmeacaAVida a2 = new AmeacaAVida(2, "Hemorragia", new ArrayList<String>());
        a2.getStatusVitima().add("Em Choque");

        System.out.println(a2);

        AmeacaAVida a3 = new AmeacaAVida(1, "Escoriações", new ArrayList<String>());
        a3.getStatusVitima().add("Estável");

        System.out.println(a3);
    }

}
