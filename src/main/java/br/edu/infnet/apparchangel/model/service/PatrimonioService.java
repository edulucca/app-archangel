package br.edu.infnet.apparchangel.model.service;

import br.edu.infnet.apparchangel.model.domain.Patrimonio;
import br.edu.infnet.apparchangel.model.test.AppImpressao;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Service
public class PatrimonioService {
    private static Map<Integer, Patrimonio> mapaPatrimonio = new HashMap<Integer, Patrimonio>();
    private static Integer id = 1;


    public void incluir(Patrimonio patrimonio){
        patrimonio.setId(id++);
        mapaPatrimonio.put(patrimonio.getId(), patrimonio);

        AppImpressao.relatorio(patrimonio, "PATRIMONIO EM RISCO!");
    }

    public void excluir(Integer id){
        mapaPatrimonio.remove(id);
    }

    public Collection<Patrimonio> obterList(){
        return mapaPatrimonio.values();
    }
}
