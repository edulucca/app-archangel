package br.edu.infnet.apparchangel.model.domain;

import java.time.LocalDateTime;

public class Emergencia {
    public String localizacao;
    public String status;
    public LocalDateTime dataHora;

    @Override
    public String toString() {
        return localizacao + ";" + status + ";" + dataHora;
    }
}
