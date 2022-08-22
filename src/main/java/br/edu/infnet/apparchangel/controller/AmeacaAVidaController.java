/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.infnet.apparchangel.controller;

import br.edu.infnet.apparchangel.model.domain.AmeacaAVida;
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
public class AmeacaAVidaController {
    private static List<AmeacaAVida> ameacaAVidas = new ArrayList<AmeacaAVida>();
    @GetMapping(value="/ameacaavida/lista")
    public String telaLista(Model model){
        AmeacaAVida a1 = new AmeacaAVida(3, "Fratura exposta", new ArrayList<String>());
        a1.getStatusVitima().add("Acordada");

        AmeacaAVida a2 = new AmeacaAVida(2, "Hemorragia", new ArrayList<String>());
        a2.getStatusVitima().add("Em Choque");

        AmeacaAVida a3 = new AmeacaAVida(1, "Escoriações", new ArrayList<String>());
        a3.getStatusVitima().add("Estável");

        ameacaAVidas.add(a1);
        ameacaAVidas.add(a2);
        ameacaAVidas.add(a3);

        model.addAttribute("listagem", ameacaAVidas);

        return "ameacaavida/lista";
    }
}
