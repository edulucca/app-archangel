package br.edu.infnet.apparchangel.model.repository;

import br.edu.infnet.apparchangel.model.domain.AmeacaAVida;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AmeacaAVidaRepository extends CrudRepository<AmeacaAVida, Integer> {
}
