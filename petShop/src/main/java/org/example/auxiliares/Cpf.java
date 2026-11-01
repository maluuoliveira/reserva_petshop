package org.example.auxiliares;

public record Cpf(String valor) {
    public Cpf {
        valor = valor.replaceAll("[^0-9]", "").trim();
        if(valor.length() != 11)
            throw new IllegalArgumentException("É necessário ter 11 dígitos numéricos");
        System.out.println("cpf validado");
    }
}
