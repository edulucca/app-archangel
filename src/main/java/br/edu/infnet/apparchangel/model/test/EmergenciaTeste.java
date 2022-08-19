/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.infnet.apparchangel.model.test;

import br.edu.infnet.apparchangel.model.domain.*;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

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
    public void run(ApplicationArguments args) throws Exception {
        Emergencia E1 = new Emergencia("Sobradinho - DF", "Ocorrendo agora", new Requisitante("Fernando Quintana","888.888.888-88", "61998738368"));

        List<Crise> listaDeCrises = new ArrayList<Crise>();

        listaDeCrises.add(new Crime(2, 1, true, false));
        listaDeCrises.add(new Patrimonio(1,"Casa", "Praga"));
        listaDeCrises.add(new AmeacaAVida(2, "Hemorragia", new ArrayList<String>()));

        E1.setCrises(listaDeCrises);

        E1.impressao();

    }
    
}
