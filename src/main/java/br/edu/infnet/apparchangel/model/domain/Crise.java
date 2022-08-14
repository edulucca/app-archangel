package br.edu.infnet.apparchangel.model.domain;

import br.edu.infnet.apparchangel.interfaces.IPrinter;

public abstract class Crise implements IPrinter{
    private Integer escalaDeRisco;
    private String nome;
    private String descricao;

    //Métodos da classe
    //public abstract void impressao();
    public abstract String definirEscalaDeRisco();
    //Getters and Setters
    public Integer getEscalaDeRisco() {
        return escalaDeRisco;
    }

    public void setEscalaDeRisco(Integer escalaDeRisco) {
        this.escalaDeRisco = escalaDeRisco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public String toString() {
        return escalaDeRisco + ";" + nome + ";" + descricao;
    }
}
