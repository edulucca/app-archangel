package br.edu.infnet.apparchangel.model.domain;

import br.edu.infnet.apparchangel.interfaces.IPrinter;
import br.edu.infnet.apparchangel.model.exception.CriseVaziaException;
import br.edu.infnet.apparchangel.model.exception.RequisitanteNuloException;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Set;

public class Emergencia implements IPrinter{
    private Integer id;
    private String localizacao;
    private String status;
    private LocalDateTime dataHora;
    private Requisitante requisitante;
    private Set<Crise> crises;

    public Emergencia(String localizacao, String status, Requisitante requisitante, Set<Crise> crises) throws RequisitanteNuloException, CriseVaziaException {
        if(requisitante == null){
            throw new RequisitanteNuloException("O Requisitante não pode ser nulo");
        }
        if(crises.isEmpty()){
            throw new CriseVaziaException("A quantidade de Crises tem que ser maior que um");
        }
        this.localizacao = localizacao;
        this.status = status;
        this.dataHora = LocalDateTime.now();
        this.requisitante = requisitante;
        this.crises = crises;
    }

    public Set<Crise> getCrises() {
        return crises;
    }

    public void setCrises(Set<Crise> crises) {
        this.crises = crises;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Requisitante getRequisitante() {
        return this.requisitante;
    }

    public void setRequisitante(Requisitante requisitante) {
        this.requisitante = requisitante;
    }

    public String getLocalizacao() {
        return localizacao;
    }

    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }

    public String getStatus() {
        return status;
    }

    public LocalDateTime getDataHora() {
        return dataHora;
    }


    @Override
    public String toString() {
        return localizacao + ";" + status + ";" + dataHora + ";" + requisitante + ";" +
                crises + ";" + crises.size();
    }

    @Override
    public void impressao() {
        System.out.println("#Emergencia");
        System.out.println(this);
    }
}
