package br.edu.infnet.apparchangel.model.test;

import br.edu.infnet.apparchangel.controller.AppController;
import br.edu.infnet.apparchangel.model.domain.Usuario;
import br.edu.infnet.apparchangel.model.domain.app.Atributo;
import br.edu.infnet.apparchangel.model.domain.app.Classe;
import br.edu.infnet.apparchangel.model.domain.app.Projeto;
import br.edu.infnet.apparchangel.model.service.AppService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Component
public class AppTeste implements ApplicationRunner {

    private List<Atributo> atributos;
    private List<Classe> classes;
    private Projeto projeto;

    @Autowired
    private AppService appService;

    @Override
    public void run(ApplicationArguments args) throws Exception {

        String dir = "F:/Projetos_InfNet/app-archangel/dev/";
        String arq = "app.txt";

        try{
            try {
                BufferedReader leitor = new BufferedReader(new FileReader(dir+arq));

                //Processamento
                String linha = leitor.readLine();

                while(linha != null){
                    String[] campo = linha.split(";");

                    switch (campo[0].toUpperCase()){
                        case "P":
                            classes = new ArrayList<Classe>();

                            projeto = new Projeto();
                            projeto.setNome(campo[1]);
                            projeto.setDescricao(campo[2]);
                            projeto.setClasses(classes);

                            break;

                        case "C":
                            atributos = new ArrayList<Atributo>();

                            Classe classe = new Classe();
                            classe.setNome(campo[1]);
                            classe.setAtributos(atributos);
                            classes.add(classe);
                            break;

                        case "A":
                            Atributo atributo = new Atributo(campo[1], campo[2], campo[3]);
                            atributos.add(atributo);
                            break;

                        default:
                            System.out.println("Erro na leitura do arquivo!");
                            break;
                    }

                    linha = leitor.readLine();
                }

                appService.incluir(projeto);


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
