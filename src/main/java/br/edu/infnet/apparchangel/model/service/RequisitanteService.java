package br.edu.infnet.apparchangel.model.service;

import br.edu.infnet.apparchangel.model.domain.Requisitante;
import br.edu.infnet.apparchangel.model.domain.Usuario;
import br.edu.infnet.apparchangel.model.repository.RequisistanteRepository;
import br.edu.infnet.apparchangel.model.test.AppImpressao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.SessionAttribute;
import org.springframework.web.bind.annotation.SessionAttributes;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class RequisitanteService {
    private static Map<Integer, Requisitante> mapaRequisitante = new HashMap<Integer, Requisitante>();
    private static Integer id = 1;

    @Autowired
    private RequisistanteRepository requisistanteRepository;

    public void incluir(Requisitante requisitante) {

        requisistanteRepository.save(requisitante);

        //requisitante.setId(id++);
        //mapaRequisitante.put(requisitante.getId(), requisitante);

        AppImpressao.relatorio(requisitante, "Dados do requisitante:");
    }

    public void excluir(Integer id){
        requisistanteRepository.deleteById(id);
        //mapaRequisitante.remove(id);
    }

    public Collection<Requisitante> obterList(){
        return (List<Requisitante>) requisistanteRepository.findAll();
        //return mapaRequisitante.values();
    }

    public Collection<Requisitante> obterList(Usuario usuario){
        return requisistanteRepository.obterLista(usuario.getId());
    }

}
