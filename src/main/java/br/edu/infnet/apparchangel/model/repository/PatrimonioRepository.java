package br.edu.infnet.apparchangel.model.repository;

import br.edu.infnet.apparchangel.model.domain.Patrimonio;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.Collection;

public interface PatrimonioRepository extends CrudRepository<Patrimonio, Integer> {
    @Query("from Patrimonio p where p.usuario.id = :idUsuario")
    Collection<Patrimonio> findAll(Integer idUsuario);
}
