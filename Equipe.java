package model;

import java.util.ArrayList;
import java.util.List;

public class Equipe {

    private int id;
    private String nomeEquipe;
    private List<Usuario> membros;

    public Equipe() {
        membros = new ArrayList<>();
    }

    public void adicionarMembro(Usuario usuario){
        membros.add(usuario);
    }
}
