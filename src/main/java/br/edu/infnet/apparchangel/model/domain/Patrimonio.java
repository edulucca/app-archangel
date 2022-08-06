package br.edu.infnet.apparchangel.model.domain;

public class Patrimonio {
    public Integer nrPatrimonio;
    public String tipo;
    public String agenteDeRisco;

    @Override
    public String toString() {
        return nrPatrimonio + ";" + tipo + ";" + agenteDeRisco;
    }
}
