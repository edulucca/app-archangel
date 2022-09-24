/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.infnet.apparchangel.controller;

import br.edu.infnet.apparchangel.model.domain.Crime;
import br.edu.infnet.apparchangel.model.domain.Crise;
import br.edu.infnet.apparchangel.model.domain.Usuario;
import br.edu.infnet.apparchangel.model.service.CriseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.SessionAttribute;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author eduardo.s.santana
 */
@Controller
public class CriseController {
    private static List<Crise> crises = new ArrayList<Crise>();

    @Autowired
    private CriseService criseService;

    @GetMapping(value="/crise/lista")
    public String telaLista(Model model, @SessionAttribute("user")Usuario usuario){

        model.addAttribute("listagem", criseService.obterList(usuario)); //usuario
        return "crise/lista";
    }

    @GetMapping(value = "/crise/{id}/excluir")
    public String excluir(@PathVariable Integer id){

        criseService.excluir(id);

        return "redirect:/crise/lista";
    }
}
