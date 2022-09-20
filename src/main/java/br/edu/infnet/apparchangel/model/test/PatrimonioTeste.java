package br.edu.infnet.apparchangel.model.test;

import br.edu.infnet.apparchangel.controller.PatrimonioController;
import br.edu.infnet.apparchangel.model.domain.Patrimonio;
import br.edu.infnet.apparchangel.model.exception.EscalaDeRiscoMaiorQueTresException;
import br.edu.infnet.apparchangel.model.service.PatrimonioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

@Component
public class PatrimonioTeste implements ApplicationRunner {
    @Autowired
    private PatrimonioService patrimonioService;

    @Override
    public void run(ApplicationArguments args){
        String dir = "F:/Projetos_InfNet/app-archangel/dev/";
        String arq = "crises.txt";

        try{
            try {
                BufferedReader leitor = new BufferedReader(new FileReader(dir+arq));

                //Processamento
                String linha = leitor.readLine();
                while(linha != null){

                    try {
                        String[] campo = linha.split(";");

                        if(campo[0].equalsIgnoreCase("P")){
                            Patrimonio p1 = new Patrimonio(Integer.parseInt(campo[1]),campo[2], campo[3]);
                            p1.setEscalaDeRisco(1);
                            p1.setNome("Dano ao Patrimonio - " + campo[4]);
                            System.out.println(p1.definirEscalaDeRisco());

                            patrimonioService.incluir(p1);
                        }



                    } catch (EscalaDeRiscoMaiorQueTresException e) {
                        System.out.println("[ERROR - PATRIMONIO] " + e.getMessage());
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
