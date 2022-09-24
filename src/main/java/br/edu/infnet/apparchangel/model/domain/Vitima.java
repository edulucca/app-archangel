package br.edu.infnet.apparchangel.model.domain;

import br.edu.infnet.apparchangel.interfaces.IPrinter;

import javax.persistence.*;

@Entity
@Table(name = "TVitima")
public class Vitima implements IPrinter {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nome;
    private String nomeDaMae;
    private String idade;

    @ManyToOne
    @JoinColumn(name = "idAmeacaavida")
    private AmeacaAVida ameacaAVida;

    public Vitima(){
    }
    public Vitima(String nome, String nomeDaMae, String idade) {
        this.nome = nome;
        this.nomeDaMae = nomeDaMae;
        this.idade = idade;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    @Override
    public void impressao() {
        System.out.println("#Vitima");
        System.out.println(this);
    }
}
