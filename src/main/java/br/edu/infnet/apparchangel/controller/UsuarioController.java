/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.infnet.apparchangel.controller;

import br.edu.infnet.apparchangel.model.domain.Usuario;
import br.edu.infnet.apparchangel.model.service.UsuarioService;
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
public class UsuarioController {

    @Autowired
    private UsuarioService usuarioService;
    private String mensagem;
    private String tipo;

    @GetMapping(value="/usuario/lista")
    public String telaLista(Model model){
        model.addAttribute("listagem", usuarioService.obterList());
        model.addAttribute("mensagem", mensagem);
        model.addAttribute("tipo", tipo);
        return "usuario/lista";
    }

    @GetMapping(value = "/usuario")
    public String telaCadastro(){
        return "usuario/cadastro";
    }

    @PostMapping(value = "/usuario/incluir")
    public String incluir(Usuario usuario){
        usuarioService.incluir(usuario);

        mensagem = "Inclusão do Usuário " + usuario.getNome() + " realizada com sucesso!!!";
        tipo = "alert-success";

        return "redirect:/";
    }


    @GetMapping(value = "/usuario/{email}/excluir")
    public String excluir(@PathVariable String email){

        try{
            usuarioService.excluir(email);
            mensagem = "Exclusão do Requisitante " + email + " realizada com sucesso!!!";
            tipo = "alert-success";
        }catch (Exception e){
            mensagem = "Impossível realizar a exclusão do Requisitante " + email + " realizada com sucesso!!!";
            tipo = "alert-danger";
        }

        return "redirect:/usuario/lista";
    }

}
