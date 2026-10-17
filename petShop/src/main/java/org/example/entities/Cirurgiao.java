package org.example.entities;

import org.example.interfaces.ContratoProfissionalInterface;
import org.example.enuns.Formacao;
import org.example.enuns.TipoProfissional;

import java.math.BigDecimal;

public class Cirurgiao extends Profissional implements ContratoProfissionalInterface {

    private String crmv;

    public Cirurgiao(String nome, TipoProfissional tipoProfissional, String telefone, BigDecimal salario, Integer idade, String cpf, Formacao formacao, String crmv) {
        super(nome, tipoProfissional, telefone, salario, idade, cpf, validaFormacaoCirurgiao(formacao));
        verificaCrmvInvalido(crmv);
        this.crmv = crmv;
    }

    @Override
    public Formacao validaFormacao(Formacao formacao) {
        return validaFormacaoCirurgiao(formacao);
    }

    private static Formacao validaFormacaoCirurgiao(Formacao formacao) {
        if (!Formacao.MEDICINA_VETERINARIA.equals(formacao)) {
            throw new
                IllegalArgumentException(
                        "Não é possivel cadastrar um cirugião sem formação em " + Formacao.MEDICINA_VETERINARIA.name()
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
}
