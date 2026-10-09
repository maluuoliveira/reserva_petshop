package org.example.entities;

import org.example.enuns.Formacao;
import org.example.enuns.TipoProfissional;

import java.math.BigDecimal;

public abstract class Profissional {
    protected String nome;
    protected String cpf;
    protected Integer idade;
    protected String telefone;
    protected BigDecimal salario;
    protected TipoProfissional tipoProfissional;
    protected Formacao formacao;

    public Profissional(String nome, TipoProfissional tipoProfissional, String telefone, BigDecimal salario, Integer idade, String cpf, Formacao formacao) {
        this.nome = nome;
        this.tipoProfissional = tipoProfissional;
        this.telefone = telefone;
        this.salario = salario;
        this.idade = idade;
        this.cpf = cpf;
        this.formacao = formacao;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public BigDecimal getSalario() { return salario;}

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

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public Formacao getFormacao() {
        return formacao;
    }

    public void setFormacao(Formacao formacao) {
        this.formacao = formacao;
    }
}
