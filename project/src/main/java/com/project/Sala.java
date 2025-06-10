package com.project;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Sala {
    private String numero;
    private String predio;
    
    public void setSata(String n, String p){
        this.numero = n;
        this.predio = p;
    }
}
