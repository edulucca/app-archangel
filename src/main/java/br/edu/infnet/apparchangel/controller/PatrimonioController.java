/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.infnet.apparchangel.controller;

import br.edu.infnet.apparchangel.model.domain.AmeacaAVida;
import br.edu.infnet.apparchangel.model.domain.Crime;
import br.edu.infnet.apparchangel.model.domain.Patrimonio;
import br.edu.infnet.apparchangel.model.domain.Usuario;
import br.edu.infnet.apparchangel.model.service.PatrimonioService;
import br.edu.infnet.apparchangel.model.test.AppImpressao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttribute;

import java.util.*;

/**
 * @author eduardo.s.santana
 */
@Controller
public class PatrimonioController {
    @Autowired
    private PatrimonioService patrimonioService;

    @GetMapping(value = "/patrimonio/lista")
    public String telaLista(Model model, @SessionAttribute("user") Usuario usuario) {
        model.addAttribute("listagem", patrimonioService.obterList(usuario));

        return "patrimonio/lista";
    }

    @GetMapping(value = "/patrimonio/{id}/excluir")
    public String exclusao(@PathVariable Integer id) {

        patrimonioService.excluir(id);

        return "redirect:/patrimonio/lista";
    }

    @GetMapping(value = "/patrimonio")
    public String telaCadastro(){
        return "patrimonio/cadastro";
    }

    @PostMapping(value = "/patrimonio/incluir")
    public String incluir(Patrimonio patrimonio, @SessionAttribute("user") Usuario usuario){
        patrimonio.setUsuario(usuario);

        patrimonioService.incluir(patrimonio);
        return "redirect:/patrimonio/lista";
    }
}
