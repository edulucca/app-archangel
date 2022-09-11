/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.infnet.apparchangel.model.test;

import br.edu.infnet.apparchangel.controller.EmergenciaController;
import br.edu.infnet.apparchangel.model.domain.*;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import br.edu.infnet.apparchangel.model.exception.CpfInvalidoException;
import br.edu.infnet.apparchangel.model.exception.CriseVaziaException;
import br.edu.infnet.apparchangel.model.exception.RequisitanteNuloException;
import br.edu.infnet.apparchangel.model.service.EmergenciaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

/**
 *
 * @author eduardo.s.santana
 */
@Component
public class EmergenciaTeste implements ApplicationRunner {
    @Autowired
    EmergenciaService emergenciaService;
    @Override
    public void run(ApplicationArguments args){
        //Declaração de variáveis
        String dir = "F:/Projetos_InfNet/app-archangel/dev/";
        String arq = "emergencias.txt";

        try{
            try {
                BufferedReader leitor = new BufferedReader(new FileReader(dir+arq));

                //Processamento
                String linha = leitor.readLine();

                while(linha != null){
                    try {
                        String[] campos = linha.split(";");
                        Requisitante r1 = new Requisitante();
                        r1.setNome(campos[2]);
                        r1.setCpf(campos[3]);
                        r1.setTelefone(campos[4]);


                        Set<Crise> listaDeCrises = new HashSet<Crise>();
                        listaDeCrises.add(new Crime(2, 1, true, false));
                        listaDeCrises.add(new AmeacaAVida(3, "Fratura exposta", new ArrayList<String>(), new ArrayList<Vitima>()));



                        emergenciaService.incluir(new Emergencia(campos[0], campos[1], r1, listaDeCrises));

                    } catch (RequisitanteNuloException | CriseVaziaException e) {
                        System.out.println("[ERROR - PEDIDO] " + e.getMessage());
                    }

                    linha = leitor.readLine();
                }

                //Close
                leitor.close();
            } catch (FileNotFoundException e) {
                System.out.println("[ERROR] O arquivo não existe");
            } catch (IOException e) {
                System.out.println("[ERROR] Problema ao fechar o arquivo");
            }
        }finally {
            System.out.println("Terminou!!!");
        }

    }
    
}
