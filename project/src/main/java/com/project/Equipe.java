package com.project;
import java.util.ArrayList;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Equipe {
    private List<Estudante> membros;
    
    public Equipe(){
        this.membros = new ArrayList<>();
    }
    
    public void add(Estudante e){
        this.membros.add(e);
    }
    public List<Estudante> getMembros(){
        return membros;
    }
}
