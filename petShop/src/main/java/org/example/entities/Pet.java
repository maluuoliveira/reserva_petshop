package org.example.entities;

import org.example.enuns.Especie;
import org.example.enuns.PortePetEnum;
import org.example.enuns.TemperamentoPetEnum;

public class  Pet {

    private String nome;
    private Integer idade;
    private TemperamentoPetEnum temperamento;
    private PortePetEnum porte;
    private Especie especie;
    private String descricaoEspecie;
    private Tutor tutor;

    public Pet(String nome, Integer idade, TemperamentoPetEnum temperamento, PortePetEnum porte, Especie especie, String descricaoEspecie, Tutor tutor) {
        this.nome = nome;
        this.idade = idade;
        this.temperamento = temperamento;
        this.porte = porte;
        this.especie = especie;
        validaEspecie(especie, descricaoEspecie);
        this.descricaoEspecie = descricaoEspecie;
        this.tutor = tutor;
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

    public Especie getEspecie() {return especie;}

    public String getDescricaoEspecie() { return descricaoEspecie;}

    public Tutor getTutor() { return tutor;}

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

    public void setEspecie( Especie especie) {this.especie = especie;}

    public void setDescricaoEspecie( String descricaoEspecie) {this.descricaoEspecie = descricaoEspecie;}

    public void setTutor(Tutor tutor) {this.tutor = tutor;}

    private void validaEspecie(Especie especie, String descricaoEspecie ){
        if(especie.equals(Especie.OUTRO)){
            if(descricaoEspecie == null || descricaoEspecie.isBlank()) {
                throw new IllegalArgumentException("É necessário adicionar a descrição da especie");
            }
        }
    }
}
