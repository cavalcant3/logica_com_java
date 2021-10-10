package com.cavalcante.logica.java.LogicaDevDojo.Básico;

import java.util.Scanner;

public class DiaDaSemana {
    public static void main(String[] args) {
        int DiaDaSemana;

        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe o número");
        DiaDaSemana = entrada.nextInt();

        if (DiaDaSemana == 1) {
            System.out.println("Hoje é domingo!");
        } else if (DiaDaSemana == 2){
            System.out.println("Hoje é segunda");
        }else if (DiaDaSemana == 3){
            System.out.println("Hoje é terça");
        }else if (DiaDaSemana == 4){
            System.out.println("Hoje é quarta");
        }else if (DiaDaSemana == 5){
            System.out.println("Hoje é quinta");
        }else if (DiaDaSemana == 6){
            System.out.println("Hoje é sexta");
        }else if (DiaDaSemana == 7){
            System.out.println("Hoje é sábado");
        } else{
            System.out.println("Numero invalido");
        }
    }
}
