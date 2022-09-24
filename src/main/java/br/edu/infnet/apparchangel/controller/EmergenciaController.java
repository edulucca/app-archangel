/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.infnet.apparchangel.controller;

import br.edu.infnet.apparchangel.model.domain.Usuario;
import br.edu.infnet.apparchangel.model.service.CriseService;
import br.edu.infnet.apparchangel.model.service.EmergenciaService;
import br.edu.infnet.apparchangel.model.service.RequisitanteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttribute;

/**
 *
 * @author eduardo.s.santana
 */
@Controller
public class EmergenciaController {
    @Autowired
    private EmergenciaService emergenciaService;

    @Autowired
    private RequisitanteService requisitanteService;

    @Autowired
    private CriseService criseService;

    @GetMapping(value="/emergencia/lista")
    public String telaLista(Model model){
        model.addAttribute("listagem", emergenciaService.obterList());
        return "emergencia/lista";
    }

    @GetMapping(value="/emergencia")
    public String telaCadastro(Model model, @SessionAttribute("user")Usuario usuario){
        model.addAttribute("requisitantes", requisitanteService.obterList(usuario));
        model.addAttribute("crises", criseService.obterList(usuario));
        return "emergencia/cadastro";
    }

    @PostMapping(value = "/emergencia/incluir")
    public String incluir(){

        return "redirect:/emergencia/lista";
    }

    @GetMapping(value = "/emergencia/{id}/excluir")
    public String exclusao(@PathVariable Integer id){

        emergenciaService.excluir(id);

        return "redirect:/emergencia/lista";
    }
}
