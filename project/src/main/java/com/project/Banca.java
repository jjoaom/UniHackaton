package com.project;
import java.util.Map;
import lombok.AllArgsConstructor;
import lombok.Data;


@Data
@AllArgsConstructor
public class Banca implements Avaliavel{
    private Projeto projetoAvaliado;
    private Map<Jurado, Integer> jurados;
    
    @Override
    public void calcularNotaFinal(){
        
    }
}
