/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.infnet.apparchangel.controller;

import br.edu.infnet.apparchangel.model.domain.Vitima;
import br.edu.infnet.apparchangel.model.service.VitimaService;
import br.edu.infnet.apparchangel.model.test.AppImpressao;
import org.springframework.beans.factory.annotation.Autowired;
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
public class VitimaController {

    @Autowired
    private VitimaService vitimaService;

    @GetMapping(value="/vitima/lista")
    public String telaLista(Model model){
        model.addAttribute("listagem", vitimaService.obterList());

        return "vitima/lista";
    }

    @GetMapping(value = "/vitima/{id}/excluir")
    public String exclusao(@PathVariable Integer id){

        vitimaService.excluir(id);

        return "redirect:/vitima/lista";
    }
}
