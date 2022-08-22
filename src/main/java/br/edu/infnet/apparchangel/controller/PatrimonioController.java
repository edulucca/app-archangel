/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.infnet.apparchangel.controller;

import br.edu.infnet.apparchangel.model.domain.AmeacaAVida;
import br.edu.infnet.apparchangel.model.domain.Crime;
import br.edu.infnet.apparchangel.model.domain.Patrimonio;
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
public class PatrimonioController {
    private static Map<Integer, Patrimonio> mapaPatrimonio = new HashMap<Integer, Patrimonio>();
    private static Integer id = 1;


    public static void incluir(Patrimonio patrimonio){
        patrimonio.setId(id++);
        mapaPatrimonio.put(patrimonio.getId(), patrimonio);

        AppImpressao.relatorio(patrimonio, "PATRIMONIO EM RISCO!");
    }

    public static void excluir(Integer id){
        mapaPatrimonio.remove(id);
    }

    public static Collection<Patrimonio> obterList(){
        return mapaPatrimonio.values();
    }
    @GetMapping(value="/patrimonio/lista")
    public String telaLista(Model model){
        model.addAttribute("listagem", obterList());

        return "patrimonio/lista";
    }

    @GetMapping(value = "/patrimonio/{id}/excluir")
    public String exclusao(@PathVariable Integer id){

        excluir(id);

        return "redirect:/patrimonio/lista";
    }
}
