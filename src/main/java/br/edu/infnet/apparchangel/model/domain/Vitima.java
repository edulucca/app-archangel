package br.edu.infnet.apparchangel.model.domain;

public class Vitima {
    private String nome;
    private String nomeDaMae;
    private String idade;

    public Vitima(String nome, String nomeDaMae, String idade) {
        this.nome = nome;
        this.nomeDaMae = nomeDaMae;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNomeDaMae() {
        return nomeDaMae;
    }

    public void setNomeDaMae(String nomeDaMae) {
        this.nomeDaMae = nomeDaMae;
    }

    public String getIdade() {
        return idade;
    }

    public void setIdade(String idade) {
        this.idade = idade;
    }

    @Override
    public String toString() {
        return nome + ";" + nomeDaMae + ";" + idade;
    }
}
