package br.edu.infnet.apparchangel.model.test;

import br.edu.infnet.apparchangel.controller.UsuarioController;
import br.edu.infnet.apparchangel.model.domain.Usuario;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;

public class UsuarioTeste implements ApplicationRunner {
    @Override
    public void run(ApplicationArguments args) throws Exception {
        Usuario user = new Usuario();
        user.setEmail("admin@admin.com");
        user.setNome("Administrador");
        user.setSenha("123");

        UsuarioController.incluir(user);
    }
}
