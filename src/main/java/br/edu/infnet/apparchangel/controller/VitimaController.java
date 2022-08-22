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
import org.springframework.web.bind.annotation.PathVariable;

import java.util.*;

/**
 *
 * @author eduardo.s.santana
 */
@Controller
public class VitimaController {
    private static List<Vitima> vitimas = new ArrayList<Vitima>();
    private static Map<Integer, Vitima> mapaVitima = new HashMap<Integer, Vitima>();
    private static Integer id = 1;


    public static void incluir(Vitima vitima){
        vitima.setId(id++);
        mapaVitima.put(vitima.getId(), vitima);

        AppImpressao.relatorio(vitima, "Dados da vítima: ");
    }

    public static void excluir(Integer id){
        mapaVitima.remove(id);
    }

    public static Collection<Vitima> obterList(){
        return mapaVitima.values();
    }

    @GetMapping(value="/vitima/lista")
    public String telaLista(Model model){
        model.addAttribute("listagem", obterList());

        return "vitima/lista";
    }

    @GetMapping(value = "/vitima/{id}/excluir")
    public String exclusao(@PathVariable Integer id){

        excluir(id);

        return "redirect:/vitima/lista";
    }
}
