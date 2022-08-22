/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.infnet.apparchangel.controller;

import br.edu.infnet.apparchangel.model.domain.Vitima;
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
public class VitimaController {
    private static List<Vitima> vitimas = new ArrayList<Vitima>();
    @GetMapping(value="/vitima/lista")
    public String telaLista(Model model){
        Vitima v1 = new Vitima("Fernanda", "Josélia", "25");

        Vitima v2 = new Vitima("Sandra", "Roberta", "42");

        Vitima v3 = new Vitima("Carlos", "Brenda","18");

        vitimas.add(v1);
        vitimas.add(v2);
        vitimas.add(v3);

        model.addAttribute("listagem", vitimas);

        return "vitima/lista";
    }
}
