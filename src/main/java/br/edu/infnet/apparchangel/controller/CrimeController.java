/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.infnet.apparchangel.controller;

import br.edu.infnet.apparchangel.model.domain.Crime;
import java.util.ArrayList;
import java.util.List;

import br.edu.infnet.apparchangel.model.test.AppImpressao;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 *
 * @author eduardo.s.santana
 */
@Controller
public class CrimeController {
    
    private static List<Crime> crimes = new ArrayList<Crime>();

    public static void incluir(Crime crime){
        crimes.add(crime);

        AppImpressao.relatorio(crime, "CRIME OCORRENDO NESTE MOMENTO!");
    }
    @GetMapping(value="/crime/lista")
    public String telaLista(Model model){
        model.addAttribute("listagem", crimes);
        return "crime/lista";
    }
}
