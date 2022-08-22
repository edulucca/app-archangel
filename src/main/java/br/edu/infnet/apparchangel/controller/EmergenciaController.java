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
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 *
 * @author eduardo.s.santana
 */
@Controller
public class EmergenciaController {

    private static List<Emergencia> emergencias = new ArrayList<Emergencia>();

    public static void incluir(Emergencia emergencia) {
        emergencias.add(emergencia);

        AppImpressao.relatorio(emergencia, "EMERGENCIA INICIADA!!!");
    }
    @GetMapping(value="/emergencia/lista")
    public String telaLista(Model model){
        model.addAttribute("listagem", emergencias);
        return "emergencia/lista";
    }
}
