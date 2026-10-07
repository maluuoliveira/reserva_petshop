package org.example.entities;

import org.example.enuns.StatusAgendamento;

import java.time.LocalDateTime;
import java.util.List;

public class Agendamento {
    private Long idAgendamento;
    private Pet pet;
    private List<Profissional> profissionals;
    private Recinto recinto;
    private List<Servico> servicos;
    private LocalDateTime inicio;
    private LocalDateTime fim;
    private StatusAgendamento status;

    public Agendamento(Long idAgendamento, StatusAgendamento status, LocalDateTime fim, LocalDateTime inicio, List<Servico> servicos, Recinto recinto, List<Profissional> profissionals, Pet pet) {
        this.idAgendamento = idAgendamento;
        this.status = status;
        this.fim = fim;
        this.inicio = inicio;
        this.servicos = servicos;
        this.recinto = recinto;
        this.profissionals = profissionals;
        this.pet = pet;
    }

    public Long getIdAgendamento() {
        return idAgendamento;
    }

    public Pet getPet() {
        return pet;
    }

    public List<Profissional> getProfissionals() {
        return profissionals;
    }

    public Recinto getRecinto() {
        return recinto;
    }

    public List<Servico> getServicos() {
        return servicos;
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

    public void setIdAgendamento(Long idAgendamento) {
        this.idAgendamento = idAgendamento;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }

    public void setProfissionals(List<Profissional> profissionals) {
        this.profissionals = profissionals;
    }

    public void setRecinto(Recinto recinto) {
        this.recinto = recinto;
    }

    public void setServicos(List<Servico> servicos) {
        this.servicos = servicos;
    }
}
