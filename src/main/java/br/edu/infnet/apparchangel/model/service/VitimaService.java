package br.edu.infnet.apparchangel.model.service;

import br.edu.infnet.apparchangel.model.domain.Vitima;
import br.edu.infnet.apparchangel.model.repository.VitimaRepository;
import br.edu.infnet.apparchangel.model.test.AppImpressao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

@Service
public class VitimaService {

    @Autowired
    VitimaRepository vitimaRepository;
    private static Map<Integer, Vitima> mapaVitima = new HashMap<Integer, Vitima>();
    private static Integer id = 1;


    public void incluir(Vitima vitima){
        vitimaRepository.save(vitima);

        AppImpressao.relatorio(vitima, "Dados da vítima: ");
    }

    public void excluir(Integer id){
        vitimaRepository.deleteById(id);
    }

    public Vitima getVitimaById(Integer id){

        //return mapaVitima.get(id);
        Optional<Vitima> vitima = vitimaRepository.findById(id);

        return vitima.get();
    }

    public Collection<Vitima> obterList(){
        return (Collection<Vitima>) vitimaRepository.findAll();
    }

}
