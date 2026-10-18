package org.example.entities;

import org.example.enuns.TipoRecinto;

public class Recinto {
    private TipoRecinto tipo;
    private String status;

    public Recinto(TipoRecinto tipo, String status) {
        this.tipo = tipo;
        this.status = status;
    }

    public String getStatus() {
        return status;
    }

    public TipoRecinto getTipo() {
        return tipo;
    }

    public void setTipo(TipoRecinto tipo) {
        this.tipo = tipo;
    }
}
