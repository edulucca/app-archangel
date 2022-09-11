package br.edu.infnet.apparchangel.model.test;

import br.edu.infnet.apparchangel.controller.CrimeController;
import br.edu.infnet.apparchangel.controller.UsuarioController;
import br.edu.infnet.apparchangel.model.domain.Crime;
import br.edu.infnet.apparchangel.model.domain.Usuario;
import br.edu.infnet.apparchangel.model.exception.EscalaDeRiscoMenorQueZeroException;
import br.edu.infnet.apparchangel.model.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

@Component
public class UsuarioTeste implements ApplicationRunner {
    @Autowired
    private UsuarioService usuarioService;

    private Usuario user;
    @Override
    public void run(ApplicationArguments args) throws Exception {
        user = new Usuario();
        user.setEmail("admin@admin.com");
        user.setNome("Administrador");
        user.setSenha("123");

        usuarioService.incluir(user);

        String dir = "F:/Projetos_InfNet/app-archangel/dev/";
        String arq = "usuarios.txt";

        try{
            try {
                BufferedReader leitor = new BufferedReader(new FileReader(dir+arq));

                //Processamento
                String linha = leitor.readLine();

                while(linha != null){
                    String[] campo = linha.split(";");

                    user = new Usuario();
                    user.setEmail(campo[1]);
                    user.setNome(campo[0]);
                    user.setSenha(campo[2]);
                    linha = leitor.readLine();

                    usuarioService.incluir(user);
                }


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
