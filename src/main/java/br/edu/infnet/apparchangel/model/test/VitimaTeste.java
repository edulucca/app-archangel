package br.edu.infnet.apparchangel.model.test;

import br.edu.infnet.apparchangel.controller.VitimaController;
import br.edu.infnet.apparchangel.model.domain.Usuario;
import br.edu.infnet.apparchangel.model.domain.Vitima;
import br.edu.infnet.apparchangel.model.service.VitimaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

@Component
public class VitimaTeste implements ApplicationRunner {

    @Autowired
    private VitimaService vitimaService;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        Usuario usuario = new Usuario();
        usuario.setId(1);

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
                    v1.setUsuario(usuario);

                    vitimaService.incluir(v1);

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
