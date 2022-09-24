package br.edu.infnet.apparchangel.model.domain;

import br.edu.infnet.apparchangel.interfaces.IPrinter;
import br.edu.infnet.apparchangel.model.exception.EscalaDeRiscoMaiorQueTresException;
import br.edu.infnet.apparchangel.model.exception.EscalaDeRiscoMenorQueZeroException;
import br.edu.infnet.apparchangel.model.exception.NumeroDeVitimasInvalidas;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "TCrise")
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class Crise implements IPrinter{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private Integer escalaDeRisco;
    private String nome;
    private String descricao;

    public Crise(){

    }

    public abstract String definirEscalaDeRisco() throws EscalaDeRiscoMenorQueZeroException, EscalaDeRiscoMaiorQueTresException, NumeroDeVitimasInvalidas;

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
