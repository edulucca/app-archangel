package br.edu.infnet.apparchangel.model.service;

import br.edu.infnet.apparchangel.model.domain.Vitima;
import br.edu.infnet.apparchangel.model.test.AppImpressao;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Service
public class VitimaService {
    private static Map<Integer, Vitima> mapaVitima = new HashMap<Integer, Vitima>();
    private static Integer id = 1;


    public void incluir(Vitima vitima){
        vitima.setId(id++);
        mapaVitima.put(vitima.getId(), vitima);

        AppImpressao.relatorio(vitima, "Dados da vítima: ");
    }

    public void excluir(Integer id){
        mapaVitima.remove(id);
    }

    public Vitima getVitimaById(Integer id){
        return mapaVitima.get(id);
    }

    public Collection<Vitima> obterList(){
        return mapaVitima.values();
    }

}
