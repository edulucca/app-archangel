package br.edu.infnet.apparchangel.model.service;

import br.edu.infnet.apparchangel.model.domain.Requisitante;
import br.edu.infnet.apparchangel.model.test.AppImpressao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Service
public class RequisitanteService {
    private static Map<Integer, Requisitante> mapaRequisitante = new HashMap<Integer, Requisitante>();
    private static Integer id = 1;


    public void incluir(Requisitante requisitante) {
        requisitante.setId(id++);
        mapaRequisitante.put(requisitante.getId(), requisitante);

        AppImpressao.relatorio(requisitante, "Dados do requisitante:");
    }

    public void excluir(Integer id){
        mapaRequisitante.remove(id);
    }

    public Collection<Requisitante> obterList(){
        return mapaRequisitante.values();
    }
}
