package org.example.entities;

import org.example.auxiliares.Cpf;
import org.example.enuns.Especializacao;
import org.example.interfaces.profissional.ContratoProfissionalFormadoInterface;
import org.example.enuns.Formacao;
import org.example.enuns.TipoProfissional;

import java.math.BigDecimal;

public class Veterinario extends Profissional implements ContratoProfissionalFormadoInterface {

    private String crmv;
    private Especializacao especializacao;

    public Veterinario(String nome, TipoProfissional tipoProfissional, String telefone, BigDecimal salario,
                       Integer idade, Cpf cpf, Formacao formacao, String crmv, Especializacao especializacao) {
        super(nome, tipoProfissional, telefone, salario, idade, cpf, validaFormacaoCirurgiao(formacao));
        verificaCrmvInvalido(crmv);
        this.crmv = crmv;
        this.especializacao = especializacao;
    }

    @Override
    public Formacao validaFormacao(Formacao formacao) {
        return validaFormacaoCirurgiao(formacao);
    }

    private static Formacao validaFormacaoCirurgiao(Formacao formacao) {
        if (!Formacao.MEDICINA_VETERINARIA.equals(formacao)) {
            System.out.println("Não é possivel cadastrar um veterinário sem formação em " + Formacao.MEDICINA_VETERINARIA.name());
            throw new
                IllegalArgumentException(
                        "Não é possivel cadastrar um veterinário sem formação em " + Formacao.MEDICINA_VETERINARIA.name()
            );
        }
        return formacao;
    }

    private void verificaCrmvInvalido(String crmv) {
         if (crmv == null || crmv.isBlank()) throw new IllegalArgumentException("CRMV é obrigatório");
    }

    /// Getters e Setters
    public String getCrmv() {
        return crmv;
    }

    public void setCrmv(String crmv) {
        verificaCrmvInvalido(crmv);
        this.crmv = crmv;
    }

    public Especializacao getEspecializacao() {
        return especializacao;
    }

    public void setEspecializacao(Especializacao especializacao) {
        this.especializacao = especializacao;
    }
}
