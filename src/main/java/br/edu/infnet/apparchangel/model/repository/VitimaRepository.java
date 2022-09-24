package br.edu.infnet.apparchangel.model.repository;

import br.edu.infnet.apparchangel.model.domain.Vitima;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface VitimaRepository extends CrudRepository<Vitima, Integer> {
/*
    @Query("from Vitima v where v.id = :idvitima")
    List<Vitima> obterVitima(Integer idvitima);
 */
}
