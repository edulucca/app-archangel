package br.edu.infnet.apparchangel.model.service;

import br.edu.infnet.apparchangel.model.domain.AmeacaAVida;
import br.edu.infnet.apparchangel.model.test.AppImpressao;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Service
public class AmeacaAVidaService {
    private static Map<Integer, AmeacaAVida> mapaAmeacaAVida = new HashMap<Integer, AmeacaAVida>();
    private static Integer id = 1;

    public void incluir(AmeacaAVida ameacaAVida){
        ameacaAVida.setId(id++);
        mapaAmeacaAVida.put(ameacaAVida.getId(), ameacaAVida);

        AppImpressao.relatorio(ameacaAVida, "ATENCAO!!! VIDA EM RISCO!");
    }

    public Collection<AmeacaAVida> obterList(){
        return mapaAmeacaAVida.values();
    }

    public void excluir(Integer id){
        mapaAmeacaAVida.remove(id);
    }
}
