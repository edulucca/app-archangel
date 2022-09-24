package br.edu.infnet.apparchangel.model.repository;

import br.edu.infnet.apparchangel.model.domain.AmeacaAVida;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Collection;

@Repository
public interface AmeacaAVidaRepository extends CrudRepository<AmeacaAVida, Integer> {
    @Query("from AmeacaAVida a where a.usuario.id = :id")
    Collection<AmeacaAVida> findAll(Integer id);
}
