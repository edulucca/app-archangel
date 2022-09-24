package br.edu.infnet.apparchangel.model.domain;

import br.edu.infnet.apparchangel.interfaces.IPrinter;
import br.edu.infnet.apparchangel.model.exception.CpfInvalidoException;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "TUsuario")
public class Usuario implements IPrinter{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nome;
    private String email;
    private String senha;

    @OneToMany
    @JoinColumn(name = "idUsuario")
    private List<Requisitante> requisitantes;

    public Usuario(String nome, String email, String senha) throws CpfInvalidoException {
        if(email == null){
            throw new CpfInvalidoException("Não é possível criar CPF nulo");
        }
        if(email.isEmpty()){
            throw new CpfInvalidoException("Não é possível aceitar CPF sem preenchimento");
        }
        this.nome = nome;
        this.email = email;
        this.senha = senha;
    }

    public Usuario() {

    }

    public List<Requisitante> getRequisitantes() {
        return requisitantes;
    }

    public void setRequisitantes(List<Requisitante> requisitantes) {
        this.requisitantes = requisitantes;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return nome + ";" + email + ";" + senha;
    }

    @Override
    public void impressao() {
        System.out.println("#Requisitante");
        System.out.println(this);
    }
}
