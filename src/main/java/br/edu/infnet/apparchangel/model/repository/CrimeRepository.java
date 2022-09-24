package br.edu.infnet.apparchangel.model.repository;

import br.edu.infnet.apparchangel.model.domain.Crime;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Collection;

@Repository
public interface CrimeRepository extends CrudRepository<Crime, Integer> {
    @Query("from Crime c where c.usuario.id = :idUsuario")
    Collection<Crime> findAll(Integer idUsuario);
}
