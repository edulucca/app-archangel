/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.infnet.apparchangel.controller;

import br.edu.infnet.apparchangel.model.domain.*;
import br.edu.infnet.apparchangel.model.test.AppImpressao;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.time.LocalDateTime;
import java.util.*;

/**
 *
 * @author eduardo.s.santana
 */
@Controller
public class EmergenciaController {
    private static Map<Integer, Emergencia> mapaEmergencia = new HashMap<Integer, Emergencia>();
    private static Integer id = 1;


    public static void incluir(Emergencia emergencia) {
        emergencia.setId(id++);
        mapaEmergencia.put(emergencia.getId(), emergencia);

        AppImpressao.relatorio(emergencia, "EMERGENCIA INICIADA!!!");
    }

    public static Collection<Emergencia> obterList(){
        return mapaEmergencia.values();
    }
    @GetMapping(value="/emergencia/lista")
    public String telaLista(Model model){
        model.addAttribute("listagem", obterList());
        return "emergencia/lista";
    }
}
