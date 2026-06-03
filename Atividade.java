package model;

import java.time.LocalDate;

public class Atividade {

    private int id;
    private String descricao;
    private LocalDate prazo;
    private boolean concluida;

    public Atividade() {}

    public Atividade(String descricao, LocalDate prazo) {
        this.descricao = descricao;
        this.prazo = prazo;
        this.concluida = false;
    }

    // Getters e Setters
}
