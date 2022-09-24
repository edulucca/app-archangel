package br.edu.infnet.apparchangel.model.domain;

import br.edu.infnet.apparchangel.interfaces.IPrinter;
import br.edu.infnet.apparchangel.model.exception.CpfInvalidoException;

import javax.persistence.*;

@Entity
@Table(name = "TRequisitante")
public class Requisitante implements IPrinter{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nome;
    private String cpf;
    private String telefone;

    @ManyToOne
    @JoinColumn(name = "idUsuario")
    private Usuario usuario;


    public Requisitante(String nome, String cpf, String telefone) throws CpfInvalidoException {
        if(cpf == null){
            throw new CpfInvalidoException("Não é possível criar CPF nulo");
        }
        if(cpf.isEmpty()){
            throw new CpfInvalidoException("Não é possível aceitar CPF sem preenchimento");
        }
        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;
    }

    public Requisitante() {

    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return nome + ";" + cpf + ";" + telefone;
    }

    @Override
    public void impressao() {
        System.out.println("#Requisitante");
        System.out.println(this);
    }
}
