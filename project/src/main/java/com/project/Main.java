package com.project;

import java.time.LocalDateTime;
import java.time.Month;

public class Main {

    public static void main(String[] args) {
        //Singleton de equipes e apresentacoes
        
        //universidades
        Universidade ufmg = Universidade.builder().nome("Universidade Federal de Minas Gerais").cnpj("17.217.985/0001-04").build();
        Universidade pucmg = Universidade.builder().nome("Pontifícia Universidade Católica de Minas Gerais").cnpj("17.178.195/0001-67").build();
        
        //empresas
        Empresa juratec = Empresa.builder().nome("Jurados Tec").cnpj("12.623.731/0001-42").build();
        Empresa juradosIA = Empresa.builder().nome("Jurados IA").cnpj("11.567.231/0001-13").build();
        Empresa juradosBrasil = Empresa.builder().nome("Jurados Brasil INC").cnpj("24.123.651/0001-23").build();
        Empresa orientaMais = Empresa.builder().nome("Orienta Mais").cnpj("12.153.753/0001-02").build();
        
        //Jurados
        Jurado jur1 = Jurado.builder().nome("John Doe").email("john.doe@juratec.org").empresa(juratec).build();
        Jurado jur2 = Jurado.builder().nome("Danilo").email("danilo@juradosBrasil.com.br").empresa(juradosBrasil).build();
        Jurado jur3 = Jurado.builder().nome("Cintia Aguiar").email("cintia.aguiar@juradosIA.com").empresa(juradosIA).build();
        Jurado jur4 = Jurado.builder().nome("Ivan Martins").email("ivan.m@juratec.org").empresa(juratec).build();
        
        Jurado jur5 = Jurado.builder().nome("Roberta Chagas").email("roberta.chagas@juradosBrasil.com.br").empresa(juradosBrasil).build();
        Jurado jur6 = Jurado.builder().nome("Pedro De Souza").email("pedrosouza@juradosIA.com").empresa(juradosIA).build();
        Jurado jur7 = Jurado.builder().nome("Jonathan Joestar").email("jonathan.joestar@juradosBrasil.com.br").empresa(juradosBrasil).build();
        Jurado jur8 = Jurado.builder().nome("Laerte").email("laerte@juratec.org").empresa(juratec).build();
        
        //orientadores
        Profissional ori1 = Profissional.builder().nome("Cleiton Tavares").email("4103541@sga.pucminas.br").empresa(orientaMais).build();
        Profissional ori2 = Profissional.builder().nome("George Milão").email("7103432@sga.pucminas.br").empresa(orientaMais).build();
        
        //alunos
        Estudante aluno1 = Estudante.builder().nome("Joao Marcos").email("1336608@sga.pucminas.br").universidade(pucmg).build();
        Estudante aluno2 = Estudante.builder().nome("Tiago de Almeida").email("6234681@sga.pucminas.br").universidade(pucmg).build();
        Estudante aluno3 = Estudante.builder().nome("Luana Costa").email("3120143@sga.pucminas.br").universidade(pucmg).build();
        Estudante aluno4 = Estudante.builder().nome("Igor Martins").email("5712134@sga.pucminas.br").universidade(pucmg).build();
        Estudante aluno5 = Estudante.builder().nome("Caio Souza").email("1303457@sga.pucminas.br").universidade(pucmg).build();
        
        Estudante aluno6 = Estudante.builder().nome("Felipe Rocha").email("8351347@ufmg.br").universidade(ufmg).build();
        Estudante aluno7 = Estudante.builder().nome("Italo Freitas").email("1225708@ufmg.br").universidade(ufmg).build();
        Estudante aluno8 = Estudante.builder().nome("Luis Augusto").email("1587412@ufmg.br").universidade(ufmg).build();
        Estudante aluno9 = Estudante.builder().nome("João Vitor").email("1178045@ufmg.br").universidade(ufmg).build();
        Estudante aluno10 = Estudante.builder().nome("Lucas Ramos").email("2845670@ufmg.br").universidade(ufmg).build();
        
        //equipe 1
        Equipe equipe1 = new Equipe();
        equipe1.add(aluno1);
        equipe1.add(aluno2);
        equipe1.add(aluno3);
        equipe1.add(aluno4);
        equipe1.add(aluno5);
        //equipe 2
        Equipe equipe2 = new Equipe();
        equipe2.add(aluno6);
        equipe2.add(aluno7);
        equipe2.add(aluno8);
        equipe2.add(aluno9);
        equipe2.add(aluno10);
        
        //add ao singleton
        Equipes.getInstance().addEquipe(equipe1);
        Equipes.getInstance().addEquipe(equipe2);
        
        //projetos
        Projeto p1 = new Projeto();
        
        Projeto p2 = new Projeto();
                  
        //bancas       
        Banca b1 = new Banca();
        //map jurados 1 com notas nulas    
        b1.getJurados().put(jur2, null);
        b1.getJurados().put(jur4, null);
        b1.getJurados().put(jur6, null);
        b1.getJurados().put(jur8, null);
        b1.getProjetoAvaliado().setProjeto(ori1, equipe1);
        //pegar notas aleatorias
        b1.obterNotaJurados();
        
        
        Banca b2 = new Banca();
        b2.getJurados().put(jur1, null);
        b2.getJurados().put(jur3, null);
        b2.getJurados().put(jur5, null);
        b2.getJurados().put(jur7, null);
        b2.obterNotaJurados();
        b2.getProjetoAvaliado().setProjeto(ori2, equipe2);
        
        //salas
        Sala s1 = new Sala("11", "43");
        Sala s2 = new Sala("12", "43");
        
        //apresentacoes
        Apresentacao a1 = new Apresentacao();
        a1.getProjeto().setOrientador(ori1);
        a1.getProjeto().setEquipe(equipe1);
        a1.setBanca(b1);
        a1.setDataHora(LocalDateTime.of(2025, Month.JUNE, 11, 10, 30));
        a1.setLocal(s2);
        
        Apresentacao a2 = new Apresentacao(p2, b2, s1, LocalDateTime.of(2025, Month.JUNE, 13, 13, 00));
        
        //add ao singleton
        Apresentacoes.getInstance().addApresentacao(a1);
        Apresentacoes.getInstance().addApresentacao(a2);
        
        Apresentacoes.getInstance().avaliarApresentacoes();
        
        Apresentacoes.getInstance().listarNotaMediaSete();
        
    }
}
