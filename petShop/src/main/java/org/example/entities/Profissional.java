package org.example.entities;

import org.example.enuns.TipoProfissional;

public abstract class Profissional {
    private String nome;
    private String cpf;
    private String idade;
    private String telefone;
    private TipoProfissional tipoProfissional;

    public Profissional(String nome, TipoProfissional tipoProfissional, String telefone, String idade, String cpf) {
        this.nome = nome;
        this.tipoProfissional = tipoProfissional;
        this.telefone = telefone;
        this.idade = idade;
        this.cpf = cpf;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public TipoProfissional getTipoProfissional() {
        return tipoProfissional;
    }

    public void setTipoProfissional(TipoProfissional tipoProfissional) {
        this.tipoProfissional = tipoProfissional;
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

    public String getIdade() {
        return idade;
    }

    public void setIdade(String idade) {
        this.idade = idade;
    }
}
