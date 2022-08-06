package br.edu.infnet.apparchangel.model.domain;

public class Vitima {
    public String nome;
    public String nomeDaMae;
    public String idade;

    @Override
    public String toString() {
        return nome + ";" + nomeDaMae + ";" + idade;
    }
}
