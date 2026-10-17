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

    public static final BigDecimal SALARIO_MINIMO = new BigDecimal("1613.00");

    public Profissional(String nome, TipoProfissional tipoProfissional, String telefone, BigDecimal salario, Integer idade, String cpf, Formacao formacao) {
        this.nome = nome;
        this.tipoProfissional = tipoProfissional;
        this.telefone = telefone;
        validaSalario(salario);
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

    public void reajusteSalarial (BigDecimal novoSalario) {
        validaSalario(novoSalario);

        int comparacao = novoSalario.compareTo(this.salario);

        if (comparacao > 0) {
            System.out.println(this.nome + " recebeu um aumento salarial");
        }else if (comparacao < 0){
            System.out.println(this.nome + " teve seu salário reduzido");
        }else{
            System.out.println(this.nome + " não teve reajuste salarial");
            return;
        }
        this.salario = novoSalario;
    }

    private void validaSalario (BigDecimal novoSalario) {
        if (novoSalario == null) {
            System.out.println("Sálario não pode ser null");
            throw new IllegalArgumentException("Salario não cadastrado");
        }
        if (novoSalario.compareTo(SALARIO_MINIMO) < 0) {
            System.out.println("O salario não pode ser menor do que o salário minimo.");
            throw new  IllegalArgumentException("O salario não pode ser menor do que o salário minimo.");
        }
    }
}
