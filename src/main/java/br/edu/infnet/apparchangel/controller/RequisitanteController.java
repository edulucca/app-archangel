/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.infnet.apparchangel.controller;

import br.edu.infnet.apparchangel.model.domain.Requisitante;
import br.edu.infnet.apparchangel.model.service.RequisitanteService;
import br.edu.infnet.apparchangel.model.test.AppImpressao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.*;

/**
 *
 * @author eduardo.s.santana
 */
@Controller
public class RequisitanteController {
    @Autowired
    private RequisitanteService requisitanteService;
    @GetMapping(value="/requisitante/lista")
    public String telaLista(Model model){
        model.addAttribute("listagem", requisitanteService.obterList());
        return "requisitante/lista";
    }

    @GetMapping(value = "/requisitante/{id}/excluir")
    public String exclusao(@PathVariable Integer id){

        requisitanteService.excluir(id);

        return "redirect:/requisitante/lista";
    }

    @GetMapping("/requisitante")
    public String telaCadastro(){
        return "requisitante/cadastro";
    }

    @PostMapping("/requisitante/incluir")
    public String incluir(Requisitante requisitante){
        requisitanteService.incluir(requisitante);
        return "redirect:/requisitante/lista";
    }
}
