package org.example.auxiliares;

public record Email(String email) {

    public Email {
        if (email == null) {
            System.out.println("Email é obrigatório");
            throw new NullPointerException("Email é obrigatório");
        }
        if (!email.contains("@") || !email.endsWith(".com")) {
            System.out.println("Email invalido");
            throw new IllegalArgumentException("Email invalido");
        }
        System.out.println("Email validado: " + email);
    }
}
