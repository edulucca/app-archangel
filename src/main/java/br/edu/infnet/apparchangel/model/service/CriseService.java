package br.edu.infnet.apparchangel.model.service;

import br.edu.infnet.apparchangel.model.domain.*;
import br.edu.infnet.apparchangel.model.repository.CriseRepository;
import br.edu.infnet.apparchangel.model.service.AmeacaAVidaService;
import br.edu.infnet.apparchangel.model.service.CrimeService;
import br.edu.infnet.apparchangel.model.service.PatrimonioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CriseService {

    @Autowired
    private CriseRepository criseRepository;

    public List<Crise> obterList(){
        return (List<Crise>) criseRepository.findAll();
    }

    public List<Crise> obterList(Usuario usuario){
        return (List<Crise>) criseRepository.findAll(usuario.getId());
    }

    public void excluir(Integer id){
        criseRepository.deleteById(id);
    }
}
