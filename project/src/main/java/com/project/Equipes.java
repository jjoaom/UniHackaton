package com.project;

import java.util.ArrayList;
import java.util.List;

public class Equipes {
    private static Equipes instance;
    private List<Equipe> equipes;
    private Equipes(){
        equipes = new ArrayList<>();
    }
    public static synchronized Equipes getInstance(){
        if(instance == null){
            instance = new Equipes();
        }
        return instance;
    }
    public void addEquipe(Equipe e){
        equipes.add(e);
    }
    public List<Equipe> getEquipes(){
        return equipes;
    }
}
