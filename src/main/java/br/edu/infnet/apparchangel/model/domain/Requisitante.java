package br.edu.infnet.apparchangel.model.domain;

public class Requisitante {
    public String nome;
    public String cpf;
    public String telefone;

    @Override
    public String toString() {
        return nome + ";" + cpf + ";" + telefone;
    }
}
