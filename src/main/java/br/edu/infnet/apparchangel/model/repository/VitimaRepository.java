package br.edu.infnet.apparchangel.model.repository;

import br.edu.infnet.apparchangel.model.domain.Usuario;
import br.edu.infnet.apparchangel.model.domain.Vitima;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.Collection;
import java.util.List;

public interface VitimaRepository extends CrudRepository<Vitima, Integer> {
    @Query("from Vitima v where v.id = :idUsuario")
    Collection<Vitima> findAll(Integer idUsuario);
}
