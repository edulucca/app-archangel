package br.edu.infnet.apparchangel.model.test;

import br.edu.infnet.apparchangel.model.domain.Requisitante;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class RequisitanteTeste implements ApplicationRunner {

    @Override
    public void run(ApplicationArguments args) throws Exception {
        System.out.println("#Requisitante");
        Requisitante r1 = new Requisitante();
        r1.telefone = "61998738368";
        r1.cpf = "888.888.888-88";
        r1.nome = "Fernando Quintana";
        System.out.println(r1);

        Requisitante r2 = new Requisitante();
        r2.telefone = "61965417532";
        r2.cpf = "777.888.888-88";
        r2.nome = "Diego Monteiro";
        System.out.println(r2);

        Requisitante r3 = new Requisitante();
        r3.telefone = "61957327863";
        r3.cpf = "777.666.888-88";
        r3.nome = "Pedro Henrique";
        System.out.println(r3);
    }
}
