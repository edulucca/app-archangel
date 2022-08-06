package br.edu.infnet.apparchangel.model.test;

import br.edu.infnet.apparchangel.model.domain.Vitima;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class VitimaTeste implements ApplicationRunner {

    @Override
    public void run(ApplicationArguments args) throws Exception {
        System.out.println("#Vítima");
        Vitima v1 = new Vitima();
        v1.nome = "Fernanda";
        v1.idade = "25";
        v1.nomeDaMae = "Josélia";
        System.out.println(v1);

        Vitima v2 = new Vitima();
        v2.nome = "Sandra";
        v2.idade = "42";
        v2.nomeDaMae = "Roberta";
        System.out.println(v2);

        Vitima v3 = new Vitima();
        v3.nome = "Carlos";
        v3.idade = "18";
        v3.nomeDaMae = "Brenda";
        System.out.println(v3);
    }
}
