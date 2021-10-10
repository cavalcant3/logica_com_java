package com.cavalcante.logica.java.LogicaDevDojo.Básico;

import java.util.Scanner;

/* Classificar a idade dos participantes para um campeonato*/




public class ClassificacaoDeParticipantes {
    public static void main(String[] args) {
        int idade;
        String nome;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Informe a idade do participante");
        idade = entrada.nextInt();

        System.out.println("Informe o nome do participante");
        nome = entrada.next();

        if (idade<10){
            System.out.println(nome + " Participara da categoria infantil");
        } else if(idade>= 11 && idade<= 15){
            System.out.println(nome + " Participara da categoria juvenil");
        }else if(idade>= 16 && idade<= 19){
            System.out.println(nome + " Participara da categoria pre adulto");
        } else {
            System.out.println(nome + " Participara da categoria  adulto");
        }
    }
}
