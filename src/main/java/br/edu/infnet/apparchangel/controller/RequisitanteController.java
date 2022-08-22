/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.infnet.apparchangel.controller;

import br.edu.infnet.apparchangel.model.domain.Requisitante;
import br.edu.infnet.apparchangel.model.test.AppImpressao;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.*;

/**
 *
 * @author eduardo.s.santana
 */
@Controller
public class RequisitanteController {
    private static Map<Integer, Requisitante> mapaRequisitante = new HashMap<Integer, Requisitante>();
    private static Integer id = 1;


    public static void incluir(Requisitante requisitante) {
        requisitante.setId(id++);
        mapaRequisitante.put(requisitante.getId(), requisitante);

        AppImpressao.relatorio(requisitante, "Dados do requisitante:");
    }

    public static Collection<Requisitante> obterList(){
        return mapaRequisitante.values();
    }
    @GetMapping(value="/requisitante/lista")
    public String telaLista(Model model){
        model.addAttribute("listagem", obterList());
        return "requisitante/lista";
    }
}
