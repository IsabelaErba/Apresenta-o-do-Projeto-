package model;

public enum StatusProjeto {
    PLANEJADO,
    CONFIRMADO,
    CANCELADO,
    REAGENDADO,
    CONCLUIDO
}package service;

import model.Projeto;

public class ProjetoService {

    public void confirmarProjeto(Projeto projeto){
        projeto.confirmarProjeto();
    }

    public void cancelarProjeto(Projeto projeto){
        projeto.cancelarProjeto();
    }
}
