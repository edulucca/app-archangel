package br.edu.infnet.apparchangel.model.service;

import br.edu.infnet.apparchangel.model.domain.Crime;
import br.edu.infnet.apparchangel.model.domain.Usuario;
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

    public void incluir(Crime crime){
        crimeRepository.save(crime);
        AppImpressao.relatorio(crime, "CRIME OCORRENDO NESTE MOMENTO!");
    }

    public Collection<Crime> obterList(){
        return (Collection<Crime>) crimeRepository.findAll();
    }

    public Collection<Crime> obterList(Usuario usuario){
        return (Collection<Crime>) crimeRepository.findAll(usuario.getId());
    }

    public void excluir(Integer id){
        crimeRepository.deleteById(id);
    }

}
