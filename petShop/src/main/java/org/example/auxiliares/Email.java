package org.example.auxiliares;

public record Email(String email) {

    public Email {
        if (email == null) {
            throw new NullPointerException("Email é obrigatório");
        }
        if (!email.contains("@") || !email.endsWith(".com")) throw new IllegalArgumentException("Email invalido");
        System.out.println("Email validado: " + email);
    }
}
