package br.edu.infnet.apparchangel.model.domain;

public class Patrimonio extends Crise{
    private Integer nrPatrimonio;
    private String tipo;
    private String agenteDeRisco;

    public Patrimonio(Integer nrPatrimonio, String tipo, String agenteDeRisco) {
        this.nrPatrimonio = nrPatrimonio;
        this.tipo = tipo;
        this.agenteDeRisco = agenteDeRisco;
    }

    public Integer getNrPatrimonio() {
        return nrPatrimonio;
    }

    public void setNrPatrimonio(Integer nrPatrimonio) {
        this.nrPatrimonio = nrPatrimonio;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getAgenteDeRisco() {
        return agenteDeRisco;
    }

    public void setAgenteDeRisco(String agenteDeRisco) {
        this.agenteDeRisco = agenteDeRisco;
    }
    /*
    @Override
    public void impressao() {
        System.out.println("#Patrimonio");
        System.out.println(this);
    }
    */
    @Override
    public String toString() {
        return nrPatrimonio + ";" + tipo + ";" + agenteDeRisco + ";" + super.toString();
    }

    @Override
    public void impressao() {
        System.out.println("#Patrimonio");
        System.out.println(this);
    }

    @Override
    public String definirEscalaDeRisco() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
