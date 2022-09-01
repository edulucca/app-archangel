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

import java.util.*;

/**
 *
 * @author eduardo.s.santana
 */
@Controller
public class UsuarioController {
    
    private static List<Crime> crimes = new ArrayList<Crime>();

    private static Map<String, Usuario> mapaUsuario = new HashMap<String, Usuario>();
    //private static Integer id = 1;

    public static void incluir(Usuario usuario){
        mapaUsuario.put(usuario.getEmail(), usuario);

        AppImpressao.relatorio(usuario, "Inclusao do usuário");
    }

    public static Collection<Usuario> obterList(){
        return mapaUsuario.values();
    }

    public static void excluir(Integer id){
        mapaUsuario.remove(id);
    }

    @GetMapping(value="/usuario/lista")
    public String telaLista(Model model){
        model.addAttribute("listagem", obterList());
        return "usuario/lista";
    }

    @GetMapping(value = "/crime/{id}/excluir")
    public String exclusao(@PathVariable Integer id){

        excluir(id);

        return "redirect:/crime/lista";
    }
}
