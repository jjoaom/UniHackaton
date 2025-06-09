package com.project;
import lombok.Data;
import lombok.experimental.SuperBuilder;

@Data
@SuperBuilder
public class Jurado extends Profissional {
    private int notaDada;
}
