package br.edu.infnet.apparchangel.model.domain;

import br.edu.infnet.apparchangel.model.exception.NumeroDeVitimasInvalidas;

import java.util.List;

public class AmeacaAVida extends Crise{
    private Integer nrVitima;
    private String tipoFerimento;
    private List<String> statusVitima;

    private List<Vitima> vitimas;

    public AmeacaAVida(Integer nrVitima, String tipoFerimento, List<String> statusVitima, List<Vitima> vitimas) {
        this.nrVitima = nrVitima;
        this.tipoFerimento = tipoFerimento;
        this.statusVitima = statusVitima;
        this.vitimas = vitimas;
    }

    //Métodos da classe


    //Getter and Setter

    public List<Vitima> getVitimas() {
        return vitimas;
    }

    public void setVitimas(List<Vitima> vitimas) {
        this.vitimas = vitimas;
    }

    public void addVitima(Vitima vitima){
        this.vitimas.add(vitima);
    }

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
    public String definirEscalaDeRisco() throws NumeroDeVitimasInvalidas {
        if(vitimas.size() < 1){
            throw new NumeroDeVitimasInvalidas("O numero de vitimas ("+ vitimas.size() + ") não pode ser menor que uma");
        }

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
