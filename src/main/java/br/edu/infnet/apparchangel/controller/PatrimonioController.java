/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.infnet.apparchangel.controller;

import br.edu.infnet.apparchangel.model.domain.Crime;
import br.edu.infnet.apparchangel.model.domain.Patrimonio;
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
public class PatrimonioController {

    private static List<Patrimonio> patrimonios = new ArrayList<Patrimonio>();

    public static void incluir(Patrimonio patrimonio){
        patrimonios.add(patrimonio);

        AppImpressao.relatorio(patrimonio, "PATRIMONIO EM RISCO!");
    }
    @GetMapping(value="/patrimonio/lista")
    public String telaLista(Model model){
        model.addAttribute("listagem", patrimonios);

        return "patrimonio/lista";
    }
}
