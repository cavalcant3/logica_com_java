package com.cavalcante.logica.java.LogicaDevDojo;

import java.util.Scanner;

public class ImparOuPar {
    public static void main(String[] args) {

        int numero;

        Scanner entrada = new Scanner (System.in);
        System.out.println("informe o número");
        numero = entrada.nextInt();

        if ((numero%2)==0){
            System.out.println("é par");
        }else{
            System.out.println("é impar");
        }
    }
}
