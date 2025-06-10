package com.project;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.NoArgsConstructor;

@Data
@RequiredArgsConstructor
@AllArgsConstructor
@NoArgsConstructor
public class Projeto {
    @NonNull
    private Profissional orientador;
    @NonNull
    private Equipe equipe;
    private int notaFinal;
    
    public void setProjeto(Profissional o, Equipe e){
        this.orientador = o;
        this.equipe = e;
    }
}
