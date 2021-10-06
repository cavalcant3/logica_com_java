package com.cavalcante.logica.java.LogicaDevDojo;

/*Calcular a porcentagem de um dado salário */


import java.util.Scanner;

public class Porcentagem {
    public static void main (String args[]){

            double sal;
            double porcentagem = 0.3;
            double resultado;

        Scanner entrada = new Scanner(System.in);
        System.out.println("Informe o salário:");
        sal = entrada.nextDouble();

        resultado = sal*porcentagem;

        System.out.println(resultado);

    }
}
