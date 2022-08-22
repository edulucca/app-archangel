/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.infnet.apparchangel.controller;

import br.edu.infnet.apparchangel.model.domain.*;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 *
 * @author eduardo.s.santana
 */
@Controller
public class EmergenciaController {

    private static List<Emergencia> emergencias = new ArrayList<Emergencia>();
    @GetMapping(value="/emergencia/lista")
    public String telaLista(Model model){
        Requisitante r1 = new Requisitante("Fernando Quintana","888.888.888-88", "61998738368");
        Emergencia e1 = new Emergencia("Sobradinho - DF", "Ocorrendo agora", r1);

        Set<Crise> listaDeCrises = new HashSet<Crise>();

        listaDeCrises.add(new Crime(2, 1, true, false));
        listaDeCrises.add(new Crime(2, 1, true, false));
        listaDeCrises.add(new Crime(2, 1, true, false));
        listaDeCrises.add(new AmeacaAVida(2, "Hemorragia", new ArrayList<String>()));

        e1.setCrises(listaDeCrises);

        emergencias.add(e1);

        model.addAttribute("listagem", emergencias);
        return "emergencia/lista";
    }
}
