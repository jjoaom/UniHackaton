package com.project;
import lombok.Data;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public class Projeto {
    @NonNull
    private Profissional orientador;
    @NonNull
    private Equipe equipe;
    private int notaFinal;
}
