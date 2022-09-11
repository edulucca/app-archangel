package br.edu.infnet.apparchangel.model.service;

import br.edu.infnet.apparchangel.model.domain.Usuario;
import br.edu.infnet.apparchangel.model.test.AppImpressao;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Service
public class UsuarioService {
    private static Map<String, Usuario> mapaUsuario = new HashMap<String, Usuario>();


    public Usuario validar(String email, String senha){
        Usuario usuario = mapaUsuario.get(email);

        if(usuario != null){
            if(senha.equals(usuario.getSenha())){
                return usuario;
            }
        }
        return null;
    }

    public void incluir(Usuario usuario){
        mapaUsuario.put(usuario.getEmail(), usuario);

        AppImpressao.relatorio(usuario, "Inclusao do usuário");
    }

    public Collection<Usuario> obterList(){
        return mapaUsuario.values();
    }

    public void excluir(String email){
        mapaUsuario.remove(email);
    }

}
