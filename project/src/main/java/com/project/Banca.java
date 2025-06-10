package com.project;

import java.util.HashMap;
import java.util.Random;
import java.util.Map;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Banca implements Avaliavel {

    private Projeto projetoAvaliado = new Projeto();
    private Map<Jurado, Integer> jurados = new HashMap<>();

    private boolean juradosEstaoValidos() {
        return jurados != null && !jurados.isEmpty();
    }

    public void obterNotaJurados() {
        //verifica mapa vazio
        if (!juradosEstaoValidos()) {
            System.out.println("Mapa está vazio ou nulo.");
            return;
        }
        //insere nota aleatoriamente
        Random random = new Random();
        for (Map.Entry<Jurado, Integer> jurado : jurados.entrySet()) {
            jurado.setValue(random.nextInt(11));
            System.out.println("Nota do jurado " + jurado.getKey().getNome() + " gerada aleatoriamente: " + jurado.getValue());
        }
    }

    @Override
    public void calcularNotaFinal() {
        //verifica mapa vazio
        if (!juradosEstaoValidos()) {
            System.out.println("Mapa está vazio ou nulo.");
            return;
        }
        //obtendo a media das notas dos jurados
        int tamanho = jurados.size();
        int soma = jurados.values().stream().mapToInt(Integer::intValue).sum();

        int media = soma / tamanho;
        System.out.println("Nota final: " + media);
        this.projetoAvaliado.setNotaFinal(media);

    }
}
