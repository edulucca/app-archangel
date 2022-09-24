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



    @GetMapping(value="/ameacaavida/lista")
    public String telaLista(Model model, @SessionAttribute("user") Usuario usuario){
        model.addAttribute("listagem", ameacaAVidaService.obterList(usuario));

        return "ameacaavida/lista";
    }

    @GetMapping(value="/ameacaavida")
    public String telaCadastro(Model model){
        model.addAttribute("vitima", vitimaService.obterList());

        return "ameacaavida/cadastro";
    }

    @GetMapping(value = "/ameacaavida/{id}/excluir")
    public String exclusao(@PathVariable Integer id){

        ameacaAVidaService.excluir(id);

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

        return "redirect:/ameacaavida/lista";
    }
}
