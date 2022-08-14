package br.edu.infnet.apparchangel.model.domain;

import java.util.List;

public class AmeacaAVida extends Crise{
    private Integer nrVitima;
    private String tipoFerimento;
    private List<String> statusVitima;

    public AmeacaAVida(Integer nrVitima, String tipoFerimento, List<String> statusVitima) {
        this.nrVitima = nrVitima;
        this.tipoFerimento = tipoFerimento;
        this.statusVitima = statusVitima;
    }

    //Métodos da classe


    //Getter and Setter
    public Integer getNrVitima() {
        return nrVitima;
    }

    public void setNrVitima(Integer nrVitima) {
        this.nrVitima = nrVitima;
    }

    public String getTipoFerimento() {
        return tipoFerimento;
    }

    public void setTipoFerimento(String tipoFerimento) {
        this.tipoFerimento = tipoFerimento;
    }

    public List<String> getStatusVitima() {
        return statusVitima;
    }

    public void setStatusVitima(List<String> statusVitima) {
        this.statusVitima = statusVitima;
    }

    /*
    @Override
    public void impressao() {
        System.out.println("#AmeacaAVida");
        System.out.println(this);
    }
    */
    @Override
    public String toString() {
        return nrVitima + ";" + tipoFerimento + ";" + statusVitima + super.toString();
    }

    @Override
    public void impressao() {
        System.out.println("#AmeacaAVida");
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
