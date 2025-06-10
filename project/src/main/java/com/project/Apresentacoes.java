package com.project;

import java.util.List;
import java.util.ArrayList;

public class Apresentacoes {
    private static Apresentacoes instance;
    private List<Apresentacao> apresentacoes;
    private Apresentacoes(){
        apresentacoes = new ArrayList<>();
    }
    public static synchronized Apresentacoes getInstance(){
        if(instance == null){
            instance = new Apresentacoes();
        }
        return instance;
    }
    public void addApresentacao(Apresentacao a){
        apresentacoes.add(a);
    }
    public List<Apresentacao> getApresentacoes(){
        return apresentacoes;
    }
    public void avaliarApresentacoes(){
        for(Apresentacao a : this.apresentacoes){
            a.avaliar();
        }
    }
    public void listarNotaMediaSete(){
    this.apresentacoes.stream()
        .filter(a -> a.getProjeto().getNotaFinal() >= 7)
        .forEach(a -> System.out.println("Projeto: " + a.getProjeto().toString()));
}

}
