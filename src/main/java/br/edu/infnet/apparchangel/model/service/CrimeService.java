package br.edu.infnet.apparchangel.model.service;

import br.edu.infnet.apparchangel.model.domain.Crime;
import br.edu.infnet.apparchangel.model.repository.CrimeRepository;
import br.edu.infnet.apparchangel.model.test.AppImpressao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Service
public class CrimeService {
    @Autowired
    private CrimeRepository crimeRepository;
    private static Map<Integer, Crime> mapaCrime = new HashMap<Integer, Crime>();
    private static Integer id = 1;

    public void incluir(Crime crime){
        crimeRepository.save(crime);
        AppImpressao.relatorio(crime, "CRIME OCORRENDO NESTE MOMENTO!");
    }

    public Collection<Crime> obterList(){
        return (Collection<Crime>) crimeRepository.findAll();
    }
    public void excluir(Integer id){
        crimeRepository.deleteById(id);
    }

}
