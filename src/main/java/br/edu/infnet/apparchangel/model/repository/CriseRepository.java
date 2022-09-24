package br.edu.infnet.apparchangel.model.repository;

import br.edu.infnet.apparchangel.model.domain.Crise;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.Collection;

public interface CriseRepository  extends CrudRepository<Crise, Integer> {
    @Query("from Crise c where c.usuario.id = :idUsuario")
    Collection<Crise> findAll(Integer idUsuario);
}
