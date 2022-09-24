package br.edu.infnet.apparchangel.model.repository;

import br.edu.infnet.apparchangel.model.domain.Crise;
import br.edu.infnet.apparchangel.model.domain.Emergencia;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.Collection;

public interface EmergenciaRepository extends CrudRepository<Emergencia, Integer> {
    @Query("from Emergencia e where e.usuario.id = :idUsuario")
    Collection<Emergencia> findAll(Integer idUsuario);
}
