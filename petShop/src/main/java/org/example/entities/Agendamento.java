package org.example.entities;

import org.example.enuns.*;

import java.time.LocalDateTime;
import java.util.List;

public class Agendamento {
    private Pet pet;
    private Profissional profissional;
    private Recinto recinto;
    private Servico servico;
    private LocalDateTime inicio;
    private LocalDateTime fim;
    private StatusAgendamento status;

    public Agendamento(Servico servico, Recinto recinto, Profissional profissional, Pet pet) {
        validaAgendamento(servico, profissional, recinto);
        this.servico = servico;
        this.recinto = recinto;
        this.profissional = profissional;
        this.pet = pet;
    }

    public Pet getPet() {
        return pet;
    }

    public Profissional getProfissional() {
        return profissional;
    }

    public Recinto getRecinto() {
        return recinto;
    }

    public Servico getServico() {
        return servico;
    }

    public StatusAgendamento getStatus() {
        return status;
    }

    public LocalDateTime getFim() {
        return fim;
    }

    public LocalDateTime getInicio() {
        return inicio;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }

    public void setProfissionais(Profissional profissional) {
        this.profissional = profissional;
    }

    public void setRecinto(Recinto recinto) {
        this.recinto = recinto;
    }

    public void setServicos(Servico servico) {
        this.servico = servico;
    }

    public void confirmarAgendamento (Agendamento agendamento){
        validaAgendamento(agendamento.getServico(), agendamento.getProfissional(), agendamento.getRecinto());
        this.status = StatusAgendamento.MARCADO;
        this.inicio = LocalDateTime.now();
    }

    public void validaAgendamento (Servico servico, Profissional profissional, Recinto recinto){

        switch (servico.getTipo()){

            case CIRURGIA -> validaServicoDeCirurgia(servico, profissional, recinto);
        }

    }

    public void validaServicoDeCirurgia (Servico servico, Profissional profissional, Recinto recinto){

        if (servico.getTipo().equals(TipoServico.CIRURGIA)){

            if (!profissional.getFormacao().equals(Formacao.MEDICINA_VETERINARIA))
                throw new IllegalArgumentException("O profissional selecionado não é um veterinário");

            if (profissional instanceof Veterinario veterinario){

                if (!veterinario.getEspecializacao().equals(Especializacao.CIRURGIAO))
                    throw new IllegalArgumentException("O veterinário selecionado não é um cirurgião");

            }

        }

    }
}
