package com.project;
import lombok.Data;
import lombok.experimental.SuperBuilder;

@Data
@SuperBuilder
public class Instituicao {
    private String nome;
    private String cnpj;
    
}
