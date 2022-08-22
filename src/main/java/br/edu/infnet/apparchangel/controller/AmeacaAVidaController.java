/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.infnet.apparchangel.controller;

import br.edu.infnet.apparchangel.model.domain.AmeacaAVida;
import br.edu.infnet.apparchangel.model.domain.Crime;
import br.edu.infnet.apparchangel.model.test.AppImpressao;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.*;

/**
 * @author eduardo.s.santana
 */
@Controller
public class AmeacaAVidaController {
    private static Map<Integer, AmeacaAVida> mapaAmeacaAVida = new HashMap<Integer, AmeacaAVida>();
    private static Integer id = 1;

    public static void incluir(AmeacaAVida ameacaAVida){
        ameacaAVida.setId(id++);
        mapaAmeacaAVida.put(ameacaAVida.getId(), ameacaAVida);

        AppImpressao.relatorio(ameacaAVida, "ATENCAO!!! VIDA EM RISCO!");
    }

    public static Collection<AmeacaAVida> obterList(){
        return mapaAmeacaAVida.values();
    }

    public static void excluir(Integer id){
        mapaAmeacaAVida.remove(id);
    }
    @GetMapping(value="/ameacaavida/lista")
    public String telaLista(Model model){
        model.addAttribute("listagem", obterList());

        return "ameacaavida/lista";
    }

    @GetMapping(value = "/ameacaavida/{id}/excluir")
    public String exclusao(@PathVariable Integer id){

        excluir(id);

        return "redirect:/ameacaavida/lista";
    }
}
