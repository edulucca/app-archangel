package br.edu.infnet.apparchangel.model.service;

import br.edu.infnet.apparchangel.model.domain.Crime;
import br.edu.infnet.apparchangel.model.test.AppImpressao;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Service
public class CrimeService {
    private static Map<Integer, Crime> mapaCrime = new HashMap<Integer, Crime>();
    private static Integer id = 1;

    public void incluir(Crime crime){
        crime.setId(id++);

        mapaCrime.put(crime.getId(), crime);

        AppImpressao.relatorio(crime, "CRIME OCORRENDO NESTE MOMENTO!");
    }

    public Collection<Crime> obterList(){
        return mapaCrime.values();
    }
    public void excluir(Integer id){
        mapaCrime.remove(id);
    }

}
