package model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Projeto {

    private int id;
    private String nome;

    private CategoriaProjeto categoria;

    private LocalDate dataEvento;

    private StatusProjeto status;

    private List<Atividade> atividades;

    public Projeto() {
        atividades = new ArrayList<>();
        status = StatusProjeto.PLANEJADO;
    }

    public Projeto(String nome,
                   CategoriaProjeto categoria,
                   LocalDate dataEvento) {

        this.nome = nome;
        this.categoria = categoria;
        this.dataEvento = dataEvento;
        this.status = StatusProjeto.PLANEJADO;
        this.atividades = new ArrayList<>();
    }

    public void confirmarProjeto(){
        status = StatusProjeto.CONFIRMADO;
    }

    public void cancelarProjeto(){
        status = StatusProjeto.CANCELADO;
    }

    public void reagendarProjeto(LocalDate novaData){
        dataEvento = novaData;
        status = StatusProjeto.REAGENDADO;
    }

    public void adicionarAtividade(Atividade atividade){
        atividades.add(atividade);
    }

    // Getters e Setters
}
