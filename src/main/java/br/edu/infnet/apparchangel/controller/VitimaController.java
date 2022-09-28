/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.infnet.apparchangel.controller;

import br.edu.infnet.apparchangel.model.domain.Usuario;
import br.edu.infnet.apparchangel.model.domain.Vitima;
import br.edu.infnet.apparchangel.model.service.VitimaService;
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
public class VitimaController {

    @Autowired
    private VitimaService vitimaService;
    private String tipo;
    private String mensagem;

    @GetMapping(value="/vitima/lista")
    public String telaLista(Model model){
        model.addAttribute("listagem", vitimaService.obterList());
        model.addAttribute("mensagem", mensagem);
        model.addAttribute("tipo", tipo);

        return "vitima/lista";
    }

    @GetMapping(value = "/vitima")
    public String telaCadastro(){
        return "vitima/cadastro";
    }

    @GetMapping(value = "/vitima/{id}/excluir")
    public String exclusao(@PathVariable Integer id){
        try{
            vitimaService.excluir(id);
            mensagem = "Exclusão da Vítima " + id + " realizada com sucesso!!!";
            tipo = "alert-success";
        }catch (Exception e){
            mensagem = "Impossível realizar a exclusão da Vítima " + id + " realizada com sucesso!!!";
            tipo = "alert-danger";
        }


        return "redirect:/vitima/lista";
    }

    @PostMapping(value = "/vitima/incluir")
    public String incluir(Vitima vitima, @SessionAttribute("user")Usuario usuario){
        vitima.setUsuario(usuario);

        vitimaService.incluir(vitima);

        mensagem = "Inclusão do Requisitante " + vitima.getNome() + " realizada com sucesso!!!";
        tipo = "alert-success";
        return "redirect:/vitima/lista";
    }
}
