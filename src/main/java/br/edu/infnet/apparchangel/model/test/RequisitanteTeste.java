package br.edu.infnet.apparchangel.model.test;

import br.edu.infnet.apparchangel.controller.RequisitanteController;
import br.edu.infnet.apparchangel.model.domain.Requisitante;
import br.edu.infnet.apparchangel.model.service.RequisitanteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

@Component
public class RequisitanteTeste implements ApplicationRunner {

    @Autowired
    private RequisitanteService requisitanteService;

    @Override
    public void run(ApplicationArguments args) {

        String dir = "F:/Projetos_InfNet/app-archangel/dev/";
        String arq = "requisitantes.txt";

        try{
            try {
                BufferedReader leitor = new BufferedReader(new FileReader(dir+arq));

                //Processamento
                String linha = leitor.readLine();
                while(linha != null){
                    try {
                        String[] campo = linha.split(";");
                        Requisitante r1 = new Requisitante(campo[0],campo[1], campo[2]);
                        requisitanteService.incluir(r1);
                    } catch (Exception e) {
                        System.out.println("[ERROR] " + e.getMessage());
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
