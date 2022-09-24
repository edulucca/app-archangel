package br.edu.infnet.apparchangel.model.test;

import br.edu.infnet.apparchangel.controller.AmeacaAVidaController;
import br.edu.infnet.apparchangel.model.domain.AmeacaAVida;
import br.edu.infnet.apparchangel.model.domain.Emergencia;
import br.edu.infnet.apparchangel.model.domain.Vitima;
import br.edu.infnet.apparchangel.model.exception.NumeroDeVitimasInvalidas;
import br.edu.infnet.apparchangel.model.service.AmeacaAVidaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Component
public class AmeacaAVidaTeste implements ApplicationRunner {

    @Autowired
    private AmeacaAVidaService ameacaAVidaService;
    @Override
    public void run(ApplicationArguments args) {



        String dir = "F:/Projetos_InfNet/app-archangel/dev/";
        String arq = "crises.txt";
        try{
            try {
                BufferedReader leitor = new BufferedReader(new FileReader(dir+arq));

                //Processamento
                String linha = leitor.readLine();
                while(linha != null){

                    try {
                        String campo[] = linha.split(";");

                        if(campo[0].equalsIgnoreCase("A")){
                            AmeacaAVida a1 = new AmeacaAVida(Integer.parseInt(campo[1]),
                                    campo[2], new ArrayList<String>(),
                                    new ArrayList<Vitima>());
                            a1.addVitima(new Vitima(campo[5], campo[6], campo[4]));
                            a1.getStatusVitima().add(campo[3]);
                            a1.setEscalaDeRisco(Integer.parseInt(campo[4]));

                            a1.setNome("Ameaça a Vida - " + campo[8]);

                            System.out.println("Definicao da Escala de Risco: " + a1.definirEscalaDeRisco());

                            ameacaAVidaService.incluir(a1);
                        }

                    } catch (NumeroDeVitimasInvalidas e) {
                        System.out.println("[ERROR - AMEACAAVIDA] " + e.getMessage());
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
        /*
        try {
            AmeacaAVida a2 = new AmeacaAVida(2, "Hemorragia", new ArrayList<String>(),
                new ArrayList<Vitima>());
            a2.addVitima(new Vitima("Sandra", "Roberta", "42"));
            a2.getStatusVitima().add("Em Choque");
            a2.setEscalaDeRisco(2);
            System.out.println("Definicao da Escala de Risco: " + a2.definirEscalaDeRisco());
            AmeacaAVidaController.incluir(a2);
        } catch (NumeroDeVitimasInvalidas e) {
            System.out.println("[ERROR - AMEACAAVIDA] " + e.getMessage());
        }

        try {
            AmeacaAVida a3 = new AmeacaAVida(1, "Escoriações", new ArrayList<String>(),
                new ArrayList<Vitima>());
            a3.addVitima(new Vitima("Carlos", "Brenda","18"));
            a3.getStatusVitima().add("Estável");
            a3.setEscalaDeRisco(3);
            System.out.println("Definicao da Escala de Risco: " + a3.definirEscalaDeRisco());
            AmeacaAVidaController.incluir(a3);
        } catch (NumeroDeVitimasInvalidas e) {
            System.out.println("[ERROR - AMEACAAVIDA] " + e.getMessage());
        }

        try {
            AmeacaAVida a4 = new AmeacaAVida(1, "Escoriações", new ArrayList<String>(),
                    new ArrayList<Vitima>());
            a4.getStatusVitima().add("Estável");
            System.out.println("Definicao da Escala de Risco: " + a4.definirEscalaDeRisco());
            a4.setEscalaDeRisco(3);
            AmeacaAVidaController.incluir(a4);
        } catch (NumeroDeVitimasInvalidas e) {
            System.out.println("[ERROR - AMEACAAVIDA] " + e.getMessage());
        }
*/
    }

}
