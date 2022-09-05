/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.infnet.apparchangel.controller;

import br.edu.infnet.apparchangel.model.domain.Crime;
import br.edu.infnet.apparchangel.model.domain.Usuario;
import br.edu.infnet.apparchangel.model.test.AppImpressao;
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
public class UsuarioController {
    private static Map<String, Usuario> mapaUsuario = new HashMap<String, Usuario>();

    public static Usuario validar(String email, String senha){
        Usuario usuario = mapaUsuario.get(email);

        if(usuario != null){
            if(senha.equals(usuario.getSenha())){
                return usuario;
            }
        }
        return null;
    }

    public static void incluir(Usuario usuario){
        mapaUsuario.put(usuario.getEmail(), usuario);

        AppImpressao.relatorio(usuario, "Inclusao do usuário");
    }

    public static Collection<Usuario> obterList(){
        return mapaUsuario.values();
    }

    public static void excluir(String email){
        mapaUsuario.remove(email);
    }

    @GetMapping(value="/usuario/lista")
    public String telaLista(Model model){
        model.addAttribute("listagem", obterList());
        return "usuario/lista";
    }

    @GetMapping(value = "/usuario")
    public String telaCadastro(){
        return "usuario/cadastro";
    }

    @PostMapping(value = "/usuario/incluir")
    public String inclusao(Usuario usuario){
        incluir(usuario);
        return "redirect:/";
    }


    @GetMapping(value = "/usuario/{email}/excluir")
    public String exclusao(@PathVariable String email){

        excluir(email);

        return "redirect:/usuario/lista";
    }

}
