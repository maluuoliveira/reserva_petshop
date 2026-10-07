package org.example.interfaces;

import org.example.enuns.Formacao;

public interface ContratoProfissionalInterface {

    default Formacao validaFormacao(Formacao formacao){
        return formacao;
    }

}
