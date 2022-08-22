/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.infnet.apparchangel.controller;

import br.edu.infnet.apparchangel.model.domain.Crime;
import br.edu.infnet.apparchangel.model.domain.Crise;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author eduardo.s.santana
 */
@Controller
public class CriseController {
    private static List<Crise> crises = new ArrayList<Crise>();
    @GetMapping(value="/crise/lista")
    public String telaLista(Model model){
        Crime c1 = new Crime(2, 1, true, false);
        c1.setEscalaDeRisco(3);
        c1.setDescricao("Homens roubam e matam trabalhador");
        c1.setNome("Latrocínio");

        crises.add(c1);

        model.addAttribute("listagem", crises);
        return "crise/lista";
    }
}
