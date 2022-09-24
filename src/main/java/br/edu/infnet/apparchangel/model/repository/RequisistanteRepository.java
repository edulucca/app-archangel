package br.edu.infnet.apparchangel.model.repository;

import br.edu.infnet.apparchangel.model.domain.Requisitante;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface RequisistanteRepository extends CrudRepository<Requisitante, Integer> {

    @Query("from Requisitante r where r.usuario.id = :userid")
    List<Requisitante> obterLista(Integer userid);
}
