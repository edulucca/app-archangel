/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.infnet.apparchangel.controller;

import br.edu.infnet.apparchangel.model.domain.Requisitante;
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
public class RequisitanteController {

    private static List<Requisitante> requisitantes = new ArrayList<Requisitante>();
    @GetMapping(value="/requisitante/lista")
    public String telaLista(Model model){
        Requisitante r1 = new Requisitante("Fernando Quintana","888.888.888-88", "61998738368");

        Requisitante r2 = new Requisitante("Diego Monteiro", "777.888.888-88", "61965417532");

        Requisitante r3 = new Requisitante("Pedro Henrique", "777.666.888-88", "61957327863");

        requisitantes.add(r1);
        requisitantes.add(r2);
        requisitantes.add(r3);

        model.addAttribute("listagem", requisitantes);
        return "requisitante/lista";
    }
}
