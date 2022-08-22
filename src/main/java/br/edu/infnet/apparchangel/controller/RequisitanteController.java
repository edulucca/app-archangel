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

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author eduardo.s.santana
 */
@Controller
public class RequisitanteController {

    private static List<Requisitante> requisitantes = new ArrayList<Requisitante>();

    public static void incluir(Requisitante requisitante) {
        requisitantes.add(requisitante);

        AppImpressao.relatorio(requisitante, "Dados do requisitante:");
    }

    @GetMapping(value="/requisitante/lista")
    public String telaLista(Model model){
        model.addAttribute("listagem", requisitantes);
        return "requisitante/lista";
    }
}
