package org.example.entities;

import org.example.auxiliares.Cpf;
import org.example.auxiliares.Email;
import org.example.enuns.Especie;

import java.util.List;

public class Tutor {
    private String nome;
    private Cpf cpf;
    private Email email;
    private String telefone;
    private List<Pet> pets;

    public Tutor() {}

    public Tutor(String nome, Cpf cpf, String email, String telefone, List<Pet> pets) {
        this.nome = nome;
        this.cpf = cpf;
        this.email = new Email(email);
        this.telefone = telefone;
        this.pets = pets;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Cpf getCpf() {
        return cpf;
    }

    public void setCpf(Cpf cpf) {
        this.cpf = cpf;
    }

    public Email getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = new Email(email);
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public List<Pet> getPets() {
        return pets;
    }

    public void setPets(List<Pet> pets) {
        this.pets = pets;
    }

}
