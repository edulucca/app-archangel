package br.edu.infnet.apparchangel.model.domain;

import br.edu.infnet.apparchangel.interfaces.IPrinter;

import java.util.Objects;

public abstract class Crise implements IPrinter{
    private Integer id;
    private Integer escalaDeRisco;
    private String nome;
    private String descricao;

    public Crise(){

    }

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

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return escalaDeRisco + ";" + nome + ";" + descricao;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Crise crise = (Crise) o;
        return Objects.equals(escalaDeRisco, crise.escalaDeRisco) && Objects.equals(nome, crise.nome) && Objects.equals(descricao, crise.descricao);
    }

    @Override
    public int hashCode() {
        return Objects.hash(escalaDeRisco, nome, descricao);
    }
}
