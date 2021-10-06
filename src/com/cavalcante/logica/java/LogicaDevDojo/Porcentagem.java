package com.cavalcante.logica.java.LogicaDevDojo;

/*Calcular a porcentagem de um dado salário */


import java.util.Scanner;

public class Porcentagem {
    public static void main (String args[]){

            double sal;
            double porcentagem = 0.3;
            double resultado;
            double  porcentagem2 = 0.15;
            double  porcentagem3 = 0.5;


        Scanner entrada = new Scanner(System.in);
        System.out.println("Informe o salário:");
        sal = entrada.nextDouble();
                //porcentagem 30%
        resultado = sal*porcentagem;

        System.out.println(resultado);
                //porcentagem 15%
        resultado = sal*porcentagem2;

        System.out.println(resultado);
                //porcentagem 5%
        resultado = sal*porcentagem3;

        System.out.println(resultado);

    }
}
