package br.edu.infnet.apparchangel.model.domain;

import java.time.LocalDateTime;

public class Emergencia {
    private String localizacao;
    private String status;
    private LocalDateTime dataHora;

    public Emergencia(String localizacao, String status, LocalDateTime dataHora) {
        this.localizacao = localizacao;
        this.status = status;
        this.dataHora = dataHora;
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

    public void setStatus(String status) {
        this.status = status;
    }

    public LocalDateTime getDataHora() {
        return dataHora;
    }

    public void setDataHora(LocalDateTime dataHora) {
        this.dataHora = dataHora;
    }

    public void impressao(){
        System.out.println("#Emergencia");
        System.out.println(this);
    }
    @Override
    public String toString() {
        return localizacao + ";" + status + ";" + dataHora;
    }
}
