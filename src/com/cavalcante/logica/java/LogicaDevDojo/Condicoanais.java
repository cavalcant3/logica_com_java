package com.cavalcante.logica.java.LogicaDevDojo;
/*Receber idade e mostrar se é maior ou menor */
import java.util.Scanner;

public class Condicoanais {
    public static void main(String[] args) {

        float idade;

        Scanner entrada = new Scanner(System.in);
        System.out.println("Informe a idade");
        idade = entrada.nextFloat();
        if (idade>= 18){
            System.out.println("é maior de idade");
        } else{
            System.out.println("ainda não é maior");
        }
    }
}
