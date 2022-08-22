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

import java.util.ArrayList;
import java.util.List;

/**
 * @author eduardo.s.santana
 */
@Controller
public class AmeacaAVidaController {
    private static List<AmeacaAVida> ameacaAVidas = new ArrayList<AmeacaAVida>();

    public static void incluir(AmeacaAVida ameacaAVida){
        ameacaAVidas.add(ameacaAVida);

        AppImpressao.relatorio(ameacaAVida, "ATENCAO!!! VIDA EM RISCO!");
    }
    @GetMapping(value="/ameacaavida/lista")
    public String telaLista(Model model){
        model.addAttribute("listagem", ameacaAVidas);

        return "ameacaavida/lista";
    }
}
