/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.infnet.apparchangel.controller;

import br.edu.infnet.apparchangel.model.domain.Vitima;
import br.edu.infnet.apparchangel.model.test.AppImpressao;
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

    public static void incluir(Vitima vitima){
        vitimas.add(vitima);

        AppImpressao.relatorio(vitima, "Dados da vítima: ");
    }
    @GetMapping(value="/vitima/lista")
    public String telaLista(Model model){
        model.addAttribute("listagem", vitimas);

        return "vitima/lista";
    }
}
