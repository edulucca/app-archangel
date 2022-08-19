package br.edu.infnet.apparchangel.model.domain;

import br.edu.infnet.apparchangel.interfaces.IPrinter;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Set;

public class Emergencia implements IPrinter{
    private String localizacao;
    private String status;
    private LocalDateTime dataHora;
    private Requisitante requisitante;
    private Set<Crise> crises;

    public Emergencia(String localizacao, String status, Requisitante requisitante) {
        this.localizacao = localizacao;
        this.status = status;
        this.dataHora = LocalDateTime.now();
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

    public Set<Crise> getCrises() {
        return crises;
    }

    public void setCrises(Set<Crise> crises) {
        this.crises = crises;
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
