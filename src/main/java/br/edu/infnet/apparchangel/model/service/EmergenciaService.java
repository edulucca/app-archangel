package br.edu.infnet.apparchangel.model.service;

import br.edu.infnet.apparchangel.model.domain.Emergencia;
import br.edu.infnet.apparchangel.model.domain.Usuario;
import br.edu.infnet.apparchangel.model.repository.EmergenciaRepository;
import br.edu.infnet.apparchangel.model.test.AppImpressao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Service
public class EmergenciaService {
    @Autowired
    private EmergenciaRepository emergenciaRepository;

    public void incluir(Emergencia emergencia) {
        emergenciaRepository.save(emergencia);


        AppImpressao.relatorio(emergencia, "Dados da emergencia:");

    }

    public void excluir(Integer id){
        emergenciaRepository.deleteById(id);

    }

    public Collection<Emergencia> obterList(){
        return (Collection<Emergencia>) emergenciaRepository.findAll();
    }

    public Collection<Emergencia> obterList(Usuario usuario){
        return (Collection<Emergencia>) emergenciaRepository.findAll(usuario.getId());
    }
}
