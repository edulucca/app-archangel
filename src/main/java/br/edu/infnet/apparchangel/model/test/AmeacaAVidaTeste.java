package br.edu.infnet.apparchangel.model.test;

import br.edu.infnet.apparchangel.controller.AmeacaAVidaController;
import br.edu.infnet.apparchangel.model.domain.AmeacaAVida;
import br.edu.infnet.apparchangel.model.domain.Emergencia;
import br.edu.infnet.apparchangel.model.domain.Vitima;
import br.edu.infnet.apparchangel.model.exception.NumeroDeVitimasInvalidas;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Component
public class AmeacaAVidaTeste implements ApplicationRunner {

    @Override
    public void run(ApplicationArguments args) {

        try {
            AmeacaAVida a1 = new AmeacaAVida(3, "Fratura exposta", new ArrayList<String>(),
                    new ArrayList<Vitima>());
            a1.addVitima(new Vitima("Fernanda", "Josélia", "25"));
            a1.getStatusVitima().add("Acordada");
            a1.setEscalaDeRisco(1);
            System.out.println("Definicao da Escala de Risco: " + a1.definirEscalaDeRisco());
            AmeacaAVidaController.incluir(a1);
        } catch (NumeroDeVitimasInvalidas e) {
            System.out.println("[ERROR - AMEACAAVIDA] " + e.getMessage());
        }

        try {
            AmeacaAVida a2 = new AmeacaAVida(2, "Hemorragia", new ArrayList<String>(),
                new ArrayList<Vitima>());
            a2.addVitima(new Vitima("Sandra", "Roberta", "42"));
            a2.getStatusVitima().add("Em Choque");
            a2.setEscalaDeRisco(2);
            System.out.println("Definicao da Escala de Risco: " + a2.definirEscalaDeRisco());
            AmeacaAVidaController.incluir(a2);
        } catch (NumeroDeVitimasInvalidas e) {
            System.out.println("[ERROR - AMEACAAVIDA] " + e.getMessage());
        }

        try {
            AmeacaAVida a3 = new AmeacaAVida(1, "Escoriações", new ArrayList<String>(),
                new ArrayList<Vitima>());
            a3.addVitima(new Vitima("Carlos", "Brenda","18"));
            a3.getStatusVitima().add("Estável");
            a3.setEscalaDeRisco(3);
            System.out.println("Definicao da Escala de Risco: " + a3.definirEscalaDeRisco());
            AmeacaAVidaController.incluir(a3);
        } catch (NumeroDeVitimasInvalidas e) {
            System.out.println("[ERROR - AMEACAAVIDA] " + e.getMessage());
        }

        try {
            AmeacaAVida a4 = new AmeacaAVida(1, "Escoriações", new ArrayList<String>(),
                    new ArrayList<Vitima>());
            a4.getStatusVitima().add("Estável");
            System.out.println("Definicao da Escala de Risco: " + a4.definirEscalaDeRisco());
            a4.setEscalaDeRisco(3);
            AmeacaAVidaController.incluir(a4);
        } catch (NumeroDeVitimasInvalidas e) {
            System.out.println("[ERROR - AMEACAAVIDA] " + e.getMessage());
        }

    }

}
