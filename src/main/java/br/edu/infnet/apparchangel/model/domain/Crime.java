package br.edu.infnet.apparchangel.model.domain;

public class Crime extends Crise{
    private Integer nrVitimas;
    private Integer nrSuspeitos;
    private boolean armaBranca;
    private boolean armaDeFogo;

    public Crime(Integer nrVitimas, Integer nrSuspeitos, boolean armaBranca, boolean armaDeFogo) {
        this.nrVitimas = nrVitimas;
        this.nrSuspeitos = nrSuspeitos;
        this.armaBranca = armaBranca;
        this.armaDeFogo = armaDeFogo;
    }

    public Integer getNrVitimas() {
        return nrVitimas;
    }

    public void setNrVitimas(Integer nrVitimas) {
        this.nrVitimas = nrVitimas;
    }

    public Integer getNrSuspeitos() {
        return nrSuspeitos;
    }

    public void setNrSuspeitos(Integer nrSuspeitos) {
        this.nrSuspeitos = nrSuspeitos;
    }

    public boolean isArmaBranca() {
        return armaBranca;
    }

    public void setArmaBranca(boolean armaBranca) {
        this.armaBranca = armaBranca;
    }

    public boolean isArmaDeFogo() {
        return armaDeFogo;
    }

    public void setArmaDeFogo(boolean armaDeFogo) {
        this.armaDeFogo = armaDeFogo;
    }
    /*
    @Override
    public void impressao() {
        System.out.println("#Crime");
        System.out.println(this);
    }
    */
    @Override
    public String toString() {
        return nrVitimas + ";" + nrSuspeitos + ";" + armaBranca + ";" + armaDeFogo + ";" + super.toString();
    }

    @Override
    public void impressao() {
        System.out.println("#Crime");
        System.out.println(this);
    }

    @Override
    public String definirEscalaDeRisco() {
        if(super.getEscalaDeRisco() == 1){
            return "Risco Baixo";
        }
        else if(super.getEscalaDeRisco() == 2){
            return "Risco Médio";
        }
        else if (super.getEscalaDeRisco() == 3){
            return "Risco Alto";
        }
        else{
            return "Escala de risco não iniciada";
        }
    }
}
