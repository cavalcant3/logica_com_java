package com.cavalcante.logica.java.LogicaDevDojo.SwitchCase;

import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {
        int desejaContinuar = 1;
        Scanner entrada = new Scanner(System.in);
        do {
            System.out.println("PLayer 1: Digite um numero de um a 10");
            int num1 = entrada.nextInt();
            System.out.println("PLayer 2: Digite um numero de um a 10");
            int num2 = entrada.nextInt();
            System.out.println("Acertou" + (num1 == num2));
            System.out.println("-------------------------------------");
            System.out.println("Deseja continuar jogando?");
            System.out.println("1-sim");
            System.out.println("2-Não");
            desejaContinuar = entrada.nextInt();
        } while (desejaContinuar == 1);
    }
}
