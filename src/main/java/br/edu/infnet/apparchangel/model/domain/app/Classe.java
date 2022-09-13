package br.edu.infnet.apparchangel.model.domain.app;

import br.edu.infnet.apparchangel.interfaces.IPrinter;

import java.util.List;

public class Classe implements IPrinter {
    private String nome;

    private List<Atributo> atributos;

    public List<Atributo> getAtributos() {
        return atributos;
    }

    public void setAtributos(List<Atributo> atributos) {
        this.atributos = atributos;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public void impressao() {
        System.out.println("- - " + nome);

        for(Atributo a : atributos){
            a.impressao();
        }
    }
}
