package br.edu.infnet.apparchangel.model.domain;

import br.edu.infnet.apparchangel.interfaces.IPrinter;
import br.edu.infnet.apparchangel.model.exception.CpfInvalidoException;

public class Usuario implements IPrinter{
    private Integer id;
    private String nome;
    private String email;
    private String senha;

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
