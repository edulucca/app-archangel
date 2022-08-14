/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.infnet.apparchangel.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 *
 * @author eduardo.s.santana
 */
@Controller
public class VitimaController {
    @GetMapping(value="/vitima/lista")
    public String telaLista(){
        return "vitima/lista";
    }
}
