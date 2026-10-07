package org.example.entities;

import org.example.interfaces.ContratoProfissionalInterface;
import org.example.enuns.Formacao;
import org.example.enuns.TipoProfissional;

public class Cirurgiao extends Profissional implements ContratoProfissionalInterface {

    private String crmv;

    public Cirurgiao(String nome, TipoProfissional tipoProfissional, String telefone, String idade, String cpf, Formacao formacao,  String crmv) {
        super(nome, tipoProfissional, telefone, idade, cpf, validaFormacaoCirurgiao(formacao));
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

    /// Getters e Setters
    public String getCrmv() {
        return crmv;
    }

    public void setCrmv(String crmv) {
        this.crmv = crmv;
    }
}
