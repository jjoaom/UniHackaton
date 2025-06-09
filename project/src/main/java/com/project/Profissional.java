package com.project;
import lombok.Data;
import lombok.experimental.SuperBuilder;

@Data
@SuperBuilder
public class Profissional extends Pessoa {
    private Empresa empresa;
}
