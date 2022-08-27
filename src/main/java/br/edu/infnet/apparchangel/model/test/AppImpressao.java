package br.edu.infnet.apparchangel.model.test;

import br.edu.infnet.apparchangel.interfaces.IPrinter;
import br.edu.infnet.apparchangel.model.domain.Crise;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class AppImpressao {
    //Feature 4 - Finalizada
    public static void relatorio(IPrinter printer, String mensagem){
        System.out.println();
        System.out.println(mensagem);
        printer.impressao();
    }

    public static void main(String[] args) {
        //Declaração de variáveis
        String dir = "F:/Projetos_InfNet/app-archangel/dev/";
        String arq = "emergencias.txt";
        String linha = "";
        try{
            try {
                BufferedReader leitor = new BufferedReader(new FileReader(dir+arq));

                //Processamento

                while(linha != null){
                    System.out.println(linha);
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
