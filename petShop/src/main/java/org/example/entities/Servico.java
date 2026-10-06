package org.example.entities;

import org.example.enuns.TipoServico;

import java.math.BigDecimal;

public class Servico {
    private String nome;
    private String tempoMedio;
    private TipoServico tipo;
    private BigDecimal valor;

    public Servico(String nome, String tempoMedio, TipoServico tipo, BigDecimal valor) {
        this.nome = nome;
        this.tempoMedio = tempoMedio;
        this.tipo = tipo;
        this.valor = valor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTempoMedio() {
        return tempoMedio;
    }

    public void setTempoMedio(String tempoMedio) {
        this.tempoMedio = tempoMedio;
    }

    public TipoServico getTipo() {
        return tipo;
    }

    public void setTipo(TipoServico tipo) {
        this.tipo = tipo;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }
}
