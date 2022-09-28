/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.infnet.apparchangel.controller;

import br.edu.infnet.apparchangel.model.domain.AmeacaAVida;
import br.edu.infnet.apparchangel.model.domain.Crime;
import br.edu.infnet.apparchangel.model.domain.Usuario;
import br.edu.infnet.apparchangel.model.domain.Vitima;
import br.edu.infnet.apparchangel.model.service.AmeacaAVidaService;
import br.edu.infnet.apparchangel.model.service.VitimaService;
import br.edu.infnet.apparchangel.model.test.AppImpressao;
import com.sun.xml.bind.v2.TODO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.*;

/**
 * @author eduardo.s.santana
 */
@Controller
public class AmeacaAVidaController {

    @Autowired
    private AmeacaAVidaService ameacaAVidaService;

    @Autowired
    private VitimaService vitimaService;
    private String mensagem;
    private String tipo;


    @GetMapping(value="/ameacaavida/lista")
    public String telaLista(Model model, @SessionAttribute("user") Usuario usuario){
        model.addAttribute("listagem", ameacaAVidaService.obterList(usuario));

        model.addAttribute("mensagem", mensagem);
        model.addAttribute("tipo", tipo);

        return "ameacaavida/lista";
    }

    @GetMapping(value="/ameacaavida")
    public String telaCadastro(Model model){
        model.addAttribute("vitima", vitimaService.obterList());

        return "ameacaavida/cadastro";
    }

    @GetMapping(value = "/ameacaavida/{id}/excluir")
    public String exclusao(@PathVariable Integer id){

        try{
            ameacaAVidaService.excluir(id);
            mensagem = "Exclusão do Ameaça a Vida " + id + " realizada com sucesso!!!";
            tipo = "alert-success";
        }catch (Exception e){
            mensagem = "Impossível realizar a exclusão do Ameaça a Vida " + id + " realizada com sucesso!!!";
            tipo = "alert-danger";
        }

        return "redirect:/ameacaavida/lista";
    }

    @PostMapping(value = "/ameacaavida/incluir")
    public String inclusao(AmeacaAVida ameacaAVida, @RequestParam("statusVitimaItem") String statusVitimaItem,
                            @RequestParam("idVitima") Integer idVitima, @SessionAttribute("user") Usuario usuario){
        ameacaAVida.setUsuario(usuario);

        ameacaAVida.setStatusVitima(new ArrayList<>());
        ameacaAVida.setVitimas(new ArrayList<>());

        ameacaAVida.addStatus(statusVitimaItem);

        Vitima objVitima = vitimaService.getVitimaById(idVitima);

        ameacaAVida.addVitima(objVitima);

        ameacaAVidaService.incluir(ameacaAVida);

        mensagem = "Inclusão de Ameaça A Vida " + ameacaAVida.getNome() + " realizada com sucesso!!!";
        tipo = "alert-success";

        return "redirect:/ameacaavida/lista";
    }
}
