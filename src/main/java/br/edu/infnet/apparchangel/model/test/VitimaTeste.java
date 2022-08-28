package br.edu.infnet.apparchangel.model.test;

import br.edu.infnet.apparchangel.controller.VitimaController;
import br.edu.infnet.apparchangel.model.domain.Vitima;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

@Component
public class VitimaTeste implements ApplicationRunner {

    @Override
    public void run(ApplicationArguments args) throws Exception {

        String dir = "F:/Projetos_InfNet/app-archangel/dev/";
        String arq = "vitimas.txt";

        try{
            try {
                BufferedReader leitor = new BufferedReader(new FileReader(dir+arq));

                //Processamento
                String linha = leitor.readLine();

                while(linha != null){
                    String[] campos = linha.split(";");

                    Vitima v1 = new Vitima(campos[0], campos[1], campos[2]);
                    VitimaController.incluir(v1);

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
