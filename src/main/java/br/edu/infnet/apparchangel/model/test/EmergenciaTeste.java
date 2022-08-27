/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.infnet.apparchangel.model.test;

import br.edu.infnet.apparchangel.controller.EmergenciaController;
import br.edu.infnet.apparchangel.model.domain.*;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import br.edu.infnet.apparchangel.model.exception.CpfInvalidoException;
import br.edu.infnet.apparchangel.model.exception.CriseVaziaException;
import br.edu.infnet.apparchangel.model.exception.RequisitanteNuloException;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

/**
 *
 * @author eduardo.s.santana
 */
@Component
public class EmergenciaTeste implements ApplicationRunner {

    @Override
    public void run(ApplicationArguments args){
        try {
            Set<Crise> listaDeCrises = new HashSet<Crise>();

            listaDeCrises.add(new Crime(2, 1, true, false));
            listaDeCrises.add(new Crime(2, 1, true, false));
            listaDeCrises.add(new Crime(2, 1, true, false));
            listaDeCrises.add(new AmeacaAVida(3, "Fratura exposta", new ArrayList<String>(),
                    new ArrayList<Vitima>()));
            Emergencia E1 = new Emergencia("Sobradinho - DF", "Ocorrendo agora",
                    new Requisitante("Fernando Quintana","888.888.888-88", "61998738368"),
                    listaDeCrises);
            EmergenciaController.incluir(E1);
        } catch (CpfInvalidoException | RequisitanteNuloException | CriseVaziaException e) {
            System.out.println("[ERROR - PEDIDO] " + e.getMessage());
        }

        try {
            Set<Crise> listaDeCrises = new HashSet<Crise>();

            listaDeCrises.add(new Crime(2, 1, true, false));
            listaDeCrises.add(new Crime(2, 1, true, false));
            listaDeCrises.add(new Crime(2, 1, true, false));
            listaDeCrises.add(new AmeacaAVida(3, "Fratura exposta", new ArrayList<String>(),
                    new ArrayList<Vitima>()));
            Emergencia E2 = new Emergencia("Sobradinho - DF", "Ocorrendo agora",
                    new Requisitante("Fernando Quintana",null, "61998738368"),
                    listaDeCrises);
            EmergenciaController.incluir(E2);
        } catch (CpfInvalidoException | RequisitanteNuloException | CriseVaziaException e) {
            System.out.println("[ERROR - PEDIDO] " + e.getMessage());
        }

        try {
            Set<Crise> listaDeCrises = new HashSet<Crise>();

            listaDeCrises.add(new Crime(2, 1, true, false));
            listaDeCrises.add(new Crime(2, 1, true, false));
            listaDeCrises.add(new Crime(2, 1, true, false));
            listaDeCrises.add(new AmeacaAVida(3, "Fratura exposta", new ArrayList<String>(),
                    new ArrayList<Vitima>()));
            Emergencia E3 = new Emergencia("Sobradinho - DF", "Ocorrendo agora",
                    null, listaDeCrises);
            EmergenciaController.incluir(E3);
        } catch (RequisitanteNuloException | CriseVaziaException e) {
            System.out.println("[ERROR - PEDIDO] " + e.getMessage());
        }

        try {
            Set<Crise> listaDeCrises = new HashSet<Crise>();

            listaDeCrises.add(new Crime(2, 1, true, false));
            listaDeCrises.add(new Crime(2, 1, true, false));
            listaDeCrises.add(new Crime(2, 1, true, false));
            listaDeCrises.add(new AmeacaAVida(3, "Fratura exposta", new ArrayList<String>(),
                    new ArrayList<Vitima>()));
            Emergencia E3 = new Emergencia("Sobradinho - DF", "Ocorrendo agora",
                    new Requisitante("Fernando Quintana","888.888.888-88", "61998738368"),
                    listaDeCrises);
            EmergenciaController.incluir(E3);
        } catch (CpfInvalidoException | RequisitanteNuloException | CriseVaziaException e) {
            System.out.println("[ERROR - PEDIDO] " + e.getMessage());
        }
    }
    
}
