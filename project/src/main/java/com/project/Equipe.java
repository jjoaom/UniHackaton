package com.project;
import java.util.List;
import lombok.Data;

@Data

public class Equipe {
    private List<Estudante> membros;
    
    public void add(Estudante e){
        this.membros.add(e);
    }
    public List<Estudante> getMembros(){
        return membros;
    }
}
