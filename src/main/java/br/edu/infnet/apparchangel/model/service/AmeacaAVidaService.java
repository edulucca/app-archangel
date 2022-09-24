package br.edu.infnet.apparchangel.model.service;

import br.edu.infnet.apparchangel.model.domain.AmeacaAVida;
import br.edu.infnet.apparchangel.model.repository.AmeacaAVidaRepository;
import br.edu.infnet.apparchangel.model.test.AppImpressao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Service
public class AmeacaAVidaService {
    @Autowired
    private AmeacaAVidaRepository ameacaAVidaRepository;
    private static Map<Integer, AmeacaAVida> mapaAmeacaAVida = new HashMap<Integer, AmeacaAVida>();
    private static Integer id = 1;

    public void incluir(AmeacaAVida ameacaAVida){
        ameacaAVidaRepository.save(ameacaAVida);

        AppImpressao.relatorio(ameacaAVida, "ATENCAO!!! VIDA EM RISCO!");
    }

    public Collection<AmeacaAVida> obterList()
    {
        return (Collection<AmeacaAVida>) ameacaAVidaRepository.findAll();
    }

    public void excluir(Integer id){
        ameacaAVidaRepository.deleteById(id);
    }
}
