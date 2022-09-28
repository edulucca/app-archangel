/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.infnet.apparchangel.controller;

import br.edu.infnet.apparchangel.model.domain.Requisitante;
import br.edu.infnet.apparchangel.model.domain.Usuario;
import br.edu.infnet.apparchangel.model.service.RequisitanteService;
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
 *
 * @author eduardo.s.santana
 */
@Controller
public class RequisitanteController {
    @Autowired
    private RequisitanteService requisitanteService;
    private String mensagem;
    private String tipo;
    @GetMapping(value="/requisitante/lista")
    public String telaLista(Model model, @SessionAttribute("user") Usuario usuario){
        model.addAttribute("listagem", requisitanteService.obterList(usuario));
        model.addAttribute("mensagem", mensagem);
        model.addAttribute("tipo", tipo);

        return "requisitante/lista";
    }

    @GetMapping(value = "/requisitante/{id}/excluir")
    public String exclusao(@PathVariable Integer id){

        //TODO: Fazer este try/catch em todas as outras classes
        try{
            requisitanteService.excluir(id);
            mensagem = "Exclusão do Requisitante " + id + " realizada com sucesso!!!";
            tipo = "alert-success";
        }catch (Exception e){
            mensagem = "Impossível realizar a exclusão do Requisitante " + id + " realizada com sucesso!!!";
            tipo = "alert-danger";
        }


        return "redirect:/requisitante/lista";
    }

    @GetMapping("/requisitante")
    public String telaCadastro(){
        return "requisitante/cadastro";
    }

    @PostMapping("/requisitante/incluir")
    public String incluir(Requisitante requisitante, @SessionAttribute("user")Usuario usuario){
        requisitante.setUsuario(usuario);
        requisitanteService.incluir(requisitante);

        mensagem = "Inclusão do Requisitante " + requisitante.getNome() + " realizada com sucesso!!!";
        tipo = "alert-success";

        return "redirect:/requisitante/lista";
    }
}
