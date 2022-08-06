package br.edu.infnet.apparchangel.model.domain;

public class Crime {
    public Integer nrVitimas;
    public Integer nrSuspeitos;
    public boolean armaBranca;
    public boolean armaDeFogo;

    @Override
    public String toString() {
        return nrVitimas + ";" + nrSuspeitos + ";" + armaBranca + ";" + armaDeFogo;
    }
}
