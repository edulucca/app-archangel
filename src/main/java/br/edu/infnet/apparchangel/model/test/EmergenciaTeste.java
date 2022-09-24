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
import br.edu.infnet.apparchangel.model.exception.NumeroDeVitimasInvalidas;
import br.edu.infnet.apparchangel.model.exception.RequisitanteNuloException;
import br.edu.infnet.apparchangel.model.service.EmergenciaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

/**
 * @author eduardo.s.santana
 */
@Component
public class EmergenciaTeste implements ApplicationRunner {
    @Autowired
    EmergenciaService emergenciaService;

    @Override
    public void run(ApplicationArguments args) {
        Set<Crise> produtos = new HashSet<Crise>();
        Crime c1 = new Crime();
        c1.setId(1);
        c1.setNrSuspeitos(1);
        Crime c2 = new Crime();
        c2.setId(2);
        c2.setNrSuspeitos(2);
        Crime c3 = new Crime();
        c3.setId(3);
        c3.setNrSuspeitos(3);
        produtos.add(c1);
        produtos.add(c2);
        produtos.add(c3);

        /*
        //Declaração de variáveis
        String dir = "F:/Projetos_InfNet/app-archangel/dev/";
        String arq = "emergencias.txt";

        try {
            try {
                BufferedReader leitor = new BufferedReader(new FileReader(dir + arq));

                //Processamento
                String linha = leitor.readLine();
                Set<Crise> crises = null;
                List<Emergencia> emergencias = new ArrayList<Emergencia>();

                while (linha != null) {

                    String[] campos = linha.split(";");

                    switch (campos[0].toUpperCase()) {
                        case "E":
                            try {

                                Requisitante r1 = new Requisitante();
                                r1.setNome(campos[3]);
                                r1.setCpf(campos[4]);
                                r1.setTelefone(campos[5]);


                                crises = new HashSet<Crise>();

                                emergencias.add(new Emergencia(campos[1], campos[2], r1, crises));
                            } catch (RequisitanteNuloException  e) {
                                System.out.println("[ERROR - EMERGENCIA] " + e.getMessage());
                            }
                            break;

                        case "A":
                            try {
                                AmeacaAVida ameacaAVida = new AmeacaAVida(Integer.parseInt(campos[1]), campos[2], new ArrayList<String>(), new ArrayList<Vitima>());

                                ameacaAVida.addVitima(new Vitima(campos[5], campos[6], campos[4]));
                                ameacaAVida.getStatusVitima().add(campos[3]);
                                ameacaAVida.setEscalaDeRisco(Integer.parseInt(campos[4]));
                                ameacaAVida.definirEscalaDeRisco();
                                ameacaAVida.setNome(campos[7]);

                                crises.add(ameacaAVida);

                            } catch (NumeroDeVitimasInvalidas e) {
                                System.out.println("[ERROR - AMEACAAVIDA] " + e.getMessage());
                            }
                            break;

                        case "C":
                            Crime crime = new Crime(Integer.parseInt(campos[1]), Integer.parseInt(campos[2]), Boolean.parseBoolean(campos[3]), Boolean.parseBoolean(campos[4]));
                            crime.setNome(campos[5]);
                            crises.add(crime);
                            break;

                        case "P":
                            Patrimonio patrimonio = new Patrimonio(Integer.parseInt(campos[1]), campos[2], campos[3]);
                            patrimonio.setNome(campos[4]);
                            crises.add(patrimonio);
                            break;

                        default:
                            break;
                    }

                    linha = leitor.readLine();
                }

                for (Emergencia e : emergencias) {
                    emergenciaService.incluir(e);
                }

                //Close
                leitor.close();
            } catch (FileNotFoundException e) {
                System.out.println("[ERROR] O arquivo não existe");
            } catch (IOException e) {
                System.out.println("[ERROR] Problema ao fechar o arquivo");
            }
        } finally {
            System.out.println("Terminou!!!");
        }
*/
    }

}
