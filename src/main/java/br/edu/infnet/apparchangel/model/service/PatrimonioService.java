package br.edu.infnet.apparchangel.model.service;

import br.edu.infnet.apparchangel.model.domain.Patrimonio;
import br.edu.infnet.apparchangel.model.repository.PatrimonioRepository;
import br.edu.infnet.apparchangel.model.test.AppImpressao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Service
public class PatrimonioService {
    @Autowired
    private PatrimonioRepository patrimonioRepository;
    private static Map<Integer, Patrimonio> mapaPatrimonio = new HashMap<Integer, Patrimonio>();
    private static Integer id = 1;


    public void incluir(Patrimonio patrimonio){
        patrimonioRepository.save(patrimonio);
        AppImpressao.relatorio(patrimonio, "PATRIMONIO EM RISCO!");
    }

    public void excluir(Integer id){
        patrimonioRepository.deleteById(id);
    }

    public Collection<Patrimonio> obterList(){
        return (Collection<Patrimonio>) patrimonioRepository.findAll();
    }
}
