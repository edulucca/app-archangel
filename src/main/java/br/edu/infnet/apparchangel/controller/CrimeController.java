/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.infnet.apparchangel.controller;

import br.edu.infnet.apparchangel.model.domain.Crime;

import java.util.*;

import br.edu.infnet.apparchangel.model.domain.Usuario;
import br.edu.infnet.apparchangel.model.service.CrimeService;
import br.edu.infnet.apparchangel.model.test.AppImpressao;
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
public class CrimeController {

    @Autowired
    private CrimeService crimeService;
    private String mensagem;
    private String tipo;

    @GetMapping(value="/crime/lista")
    public String telaLista(Model model, @SessionAttribute("user")Usuario usuario){
        model.addAttribute("listagem", crimeService.obterList(usuario));

        model.addAttribute("mensagem", mensagem);
        model.addAttribute("tipo", tipo);

        return "crime/lista";
    }

    @GetMapping(value = "/crime")
    public String telaCadastro(){

        return "crime/cadastro";
    }

    @PostMapping(value = "/crime/incluir")
    public String inclusao(Crime crime, @SessionAttribute("user") Usuario usuario){
        crime.setUsuario(usuario);
        crimeService.incluir(crime);

        mensagem = "Inclusão do Crime " + crime.getNome() + " realizada com sucesso!!!";
        tipo = "alert-success";

        return "redirect:/crime/lista";
    }

    @GetMapping(value = "/crime/{id}/excluir")
    public String exclusao(@PathVariable Integer id){

        try{
            crimeService.excluir(id);
            mensagem = "Exclusão do Crime " + id + " realizada com sucesso!!!";
            tipo = "alert-success";
        }catch (Exception e){
            mensagem = "Impossível realizar a exclusão do Crime " + id + " realizada com sucesso!!!";
            tipo = "alert-danger";
        }


        return "redirect:/crime/lista";
    }
}
