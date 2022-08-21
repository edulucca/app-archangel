/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.infnet.apparchangel.controller;

import br.edu.infnet.apparchangel.model.domain.Crime;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 *
 * @author eduardo.s.santana
 */
@Controller
public class CrimeController {
    
    private static List<Crime> crimes;
    
    @GetMapping(value="/crime/lista")
    public String telaLista(Model model){
        
        crimes.add(new Crime(2, 1, true, false));
        crimes.add(new Crime(10, 5, true, true));
        crimes.add(new Crime(0,1, false, false));
        
        model.addAttribute("listagem", crimes);
        return "crime/lista";
    }
}
