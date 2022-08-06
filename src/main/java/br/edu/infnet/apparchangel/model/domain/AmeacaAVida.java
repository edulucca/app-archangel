package br.edu.infnet.apparchangel.model.domain;

import java.util.List;

public class AmeacaAVida {
    public Integer nrVitima;
    public String tipoFerimento;
    public List<String> statusVitima;

    @Override
    public String toString() {
        return nrVitima + ";" + tipoFerimento + ";" + statusVitima;
    }
}
