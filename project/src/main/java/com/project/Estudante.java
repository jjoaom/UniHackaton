package com.project;
import lombok.Data;
import lombok.experimental.SuperBuilder;

@Data
@SuperBuilder
public class Estudante extends Pessoa {
    private Universidade universidade;
}
