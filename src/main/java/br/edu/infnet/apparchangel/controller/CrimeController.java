/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.infnet.apparchangel.controller;

import br.edu.infnet.apparchangel.model.domain.Crime;

import java.util.*;

import br.edu.infnet.apparchangel.model.test.AppImpressao;
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
    
    private static List<Crime> crimes = new ArrayList<Crime>();

    private static Map<Integer, Crime> mapaCrime = new HashMap<Integer, Crime>();
    private static Integer id = 1;
    public static void incluir(Crime crime){
        crime.setId(id++);

        mapaCrime.put(crime.getId(), crime);

        AppImpressao.relatorio(crime, "CRIME OCORRENDO NESTE MOMENTO!");
    }

    public static Collection<Crime> obterList(){
        return mapaCrime.values();
    }
    public static void excluir(Integer id){
        mapaCrime.remove(id);
    }

    @GetMapping(value="/crime/lista")
    public String telaLista(Model model){
        model.addAttribute("listagem", obterList());
        return "crime/lista";
    }

    @GetMapping(value = "/crime")
    public String telaCadastro(){

        return "crime/cadastro";
    }

    @PostMapping(value = "/crime/incluir")
    public String inclusao(Crime crime){
        incluir(crime);

        System.out.println(crime.isArmaBranca());
        System.out.println(crime.isArmaDeFogo());

        return "redirect:/crime/lista";
    }

    @GetMapping(value = "/crime/{id}/excluir")
    public String exclusao(@PathVariable Integer id){

        excluir(id);

        return "redirect:/crime/lista";
    }
}
