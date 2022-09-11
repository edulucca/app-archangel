package br.edu.infnet.apparchangel.model.test;

import br.edu.infnet.apparchangel.controller.CrimeController;
import br.edu.infnet.apparchangel.model.domain.Crime;
import br.edu.infnet.apparchangel.model.exception.EscalaDeRiscoMenorQueZeroException;
import br.edu.infnet.apparchangel.model.service.CrimeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

@Component
public class CrimeTeste implements ApplicationRunner {

    @Autowired
    private CrimeService crimeService;

    @Override
    public void run(ApplicationArguments args) {

        String dir = "F:/Projetos_InfNet/app-archangel/dev/";
        String arq = "crimes.txt";

        try{
            try {
                BufferedReader leitor = new BufferedReader(new FileReader(dir+arq));

                //Processamento
                String linha = leitor.readLine();

                while(linha != null){
                    try {
                        String[] campo = linha.split(";");
                        Crime c1 = new Crime(Integer.parseInt(campo[0]), Integer.parseInt(campo[1]), Boolean.parseBoolean(campo[2]),
                                            Boolean.parseBoolean(campo[3]));
                        c1.setEscalaDeRisco(2);
                        System.out.println("Definicao da Escala de Risco: " + c1.definirEscalaDeRisco());
                        crimeService.incluir(c1);
                    } catch (EscalaDeRiscoMenorQueZeroException e) {
                        System.out.println("[ERROR - CRIME] " + e.getMessage());
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
