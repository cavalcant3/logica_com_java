package com.cavalcante.logica.java.LogicaDevDojo.Básico;

import java.util.Scanner;

public class LacoDeRepeticao {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o número a ser impresso");
        int number = entrada.nextInt();
        int counter = 0;
        while(counter != number){
            counter++;
            if(counter%2 == 1){
                System.out.println(counter);
            }
        }
    }
}
