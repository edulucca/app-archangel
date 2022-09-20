package br.edu.infnet.apparchangel.controller;

import br.edu.infnet.apparchangel.model.domain.AmeacaAVida;
import br.edu.infnet.apparchangel.model.domain.Crime;
import br.edu.infnet.apparchangel.model.domain.Crise;
import br.edu.infnet.apparchangel.model.domain.Patrimonio;
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
    private AmeacaAVidaService ameacaAVidaService;

    @Autowired
    private CrimeService crimeService;

    @Autowired
    private PatrimonioService patrimonioService;

    public List<Crise> obterList(){
        List<Crise> crises = new ArrayList<Crise>();

        crises.addAll(ameacaAVidaService.obterList());
        crises.addAll(crimeService.obterList());
        crises.addAll(patrimonioService.obterList());

        return crises;
    }
}
