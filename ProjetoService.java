package service;

import model.Projeto;

public class ProjetoService {

    public void confirmarProjeto(Projeto projeto){
        projeto.confirmarProjeto();
    }

    public void cancelarProjeto(Projeto projeto){
        projeto.cancelarProjeto();
    }
}
