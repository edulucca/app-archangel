package br.edu.infnet.apparchangel.model.test;

import br.edu.infnet.apparchangel.controller.CrimeController;
import br.edu.infnet.apparchangel.model.domain.Crime;
import br.edu.infnet.apparchangel.model.exception.EscalaDeRiscoMenorQueZeroException;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class CrimeTeste implements ApplicationRunner {
    @Override
    public void run(ApplicationArguments args) {
        try {
            Crime c1 = new Crime(2, 1, true, false);
            c1.setEscalaDeRisco(2);
            System.out.println("Definicao da Escala de Risco: " + c1.definirEscalaDeRisco());
            CrimeController.incluir(c1);
        } catch (EscalaDeRiscoMenorQueZeroException e) {
            System.out.println("[ERROR - CRIME] " + e.getMessage());
        }


        try {
            Crime c2 = new Crime(10, 5, true, true);
            c2.setEscalaDeRisco(1);
            System.out.println("Definicao da Escala de Risco: " + c2.definirEscalaDeRisco());
            CrimeController.incluir(c2);
        } catch (EscalaDeRiscoMenorQueZeroException e) {
            System.out.println("[ERROR - CRIME] " + e.getMessage());
        }


        try {
            Crime c3 = new Crime(0,1, false, false);
            c3.setEscalaDeRisco(3);
            System.out.println("Definicao da Escala de Risco: " + c3.definirEscalaDeRisco());
            CrimeController.incluir(c3);
        } catch (EscalaDeRiscoMenorQueZeroException e) {
            System.out.println("[ERROR - CRIME] " + e.getMessage());
        }


        try {
            Crime c4 = new Crime(0,1, false, false);
            c4.setEscalaDeRisco(0);
            System.out.println("Definicao da Escala de Risco: " + c4.definirEscalaDeRisco());
            CrimeController.incluir(c4);
        } catch (EscalaDeRiscoMenorQueZeroException e) {
            System.out.println("[ERROR - CRIME] " + e.getMessage());
        }

    }
}
