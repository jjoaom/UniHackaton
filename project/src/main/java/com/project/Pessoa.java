package com.project;
import lombok.Data;
import lombok.experimental.SuperBuilder;

@Data
@SuperBuilder
public class Pessoa {
    private String nome;
    private String email;
}
