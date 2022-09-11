/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.infnet.apparchangel.controller;

import br.edu.infnet.apparchangel.model.domain.Crime;

import java.util.*;

import br.edu.infnet.apparchangel.model.service.CrimeService;
import br.edu.infnet.apparchangel.model.test.AppImpressao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

/**
 *
 * @author eduardo.s.santana
 */
@Controller
public class CrimeController {

    @Autowired
    private CrimeService crimeService;
    @GetMapping(value="/crime/lista")
    public String telaLista(Model model){
        model.addAttribute("listagem", crimeService.obterList());
        return "crime/lista";
    }

    @GetMapping(value = "/crime")
    public String telaCadastro(){

        return "crime/cadastro";
    }

    @PostMapping(value = "/crime/incluir")
    public String inclusao(Crime crime){
        crimeService.incluir(crime);

        System.out.println(crime.isArmaBranca());
        System.out.println(crime.isArmaDeFogo());

        return "redirect:/crime/lista";
    }

    @GetMapping(value = "/crime/{id}/excluir")
    public String exclusao(@PathVariable Integer id){

        crimeService.excluir(id);

        return "redirect:/crime/lista";
    }
}
