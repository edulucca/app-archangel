package br.edu.infnet.apparchangel.model.repository;

import br.edu.infnet.apparchangel.model.domain.Usuario;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends CrudRepository<Usuario, Integer> {
}
