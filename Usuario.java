package model;

import java.time.LocalDate;

public class Usuario {

    private int id;
    private String nome;
    private String email;
    private String telefone;
    private LocalDate dataNascimento;

    public Usuario() {}

    public Usuario(String nome, String email, String telefone, LocalDate dataNascimento) {
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
        this.dataNascimento = dataNascimento;
    }

    // Getters e Setters
}
