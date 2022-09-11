package br.edu.infnet.apparchangel.model.service;

import br.edu.infnet.apparchangel.model.domain.Emergencia;
import br.edu.infnet.apparchangel.model.test.AppImpressao;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Service
public class EmergenciaService {
    private static final Map<Integer, Emergencia> mapaEmergencia = new HashMap<Integer, Emergencia>();
    private static Integer id = 1;

    public void incluir(Emergencia emergencia) {
        emergencia.setId(id++);

        mapaEmergencia.put(emergencia.getId(), emergencia);

        AppImpressao.relatorio(emergencia, "Dados da emergencia:");

    }

    public void excluir(Integer id){
        mapaEmergencia.remove(id);
    }

    public Collection<Emergencia> obterList(){
        return mapaEmergencia.values();
    }
}
