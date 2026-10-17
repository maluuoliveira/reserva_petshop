package org.example.entities;

import org.example.enuns.PortePetEnum;
import org.example.enuns.TemperamentoPetEnum;

public abstract class  Pet {

    private String nome;
    private Integer idade;
    private TemperamentoPetEnum temperamento;
    private PortePetEnum porte;

    public Pet(Long id, String nome, Integer idade, TemperamentoPetEnum temperamento, PortePetEnum porte) {
        this.nome = nome;
        this.idade = idade;
        this.temperamento = temperamento;
        this.porte = porte;
    }

    public String getNome() {
        return nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public TemperamentoPetEnum getTemperamento() {
        return temperamento;
    }

    public PortePetEnum getPorte() {
        return porte;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setTemperamento(TemperamentoPetEnum temperamento) {
        this.temperamento = temperamento;
    }

    public void setPorte(PortePetEnum porte) {
        this.porte = porte;
    }
}
