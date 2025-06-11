package com.project;
import java.time.LocalDateTime;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Apresentacao {
    private Projeto projeto = new Projeto();
    private Avaliavel banca = new Banca();
    private Sala local;
    private LocalDateTime dataHora;
        
    public void avaliar(){
        this.banca.calcularNotaFinal();
    }
}
