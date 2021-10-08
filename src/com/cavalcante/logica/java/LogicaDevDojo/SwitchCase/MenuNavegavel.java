package com.cavalcante.logica.java.LogicaDevDojo.SwitchCase;

import java.util.Scanner;

//Criar um menu navegavel que tem opções:
// 1- calcular imposto
// 2- depositar salario
// 3- sair
// enquanto não digita o valor 3 não pode sair
public class MenuNavegavel {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        System.out.println("-----------------------");
        System.out.println("|Menu disponivel:     |");
        System.out.println("|1- calcular imposto  |");
        System.out.println("|2- depositar salario |");
        System.out.println("|3- sair              |");
        System.out.println("-----------------------");
        int menu= 0;
        menu= entrada.nextInt();
       while(menu != 3){
           System.out.println("-----------------------");
           System.out.println("|Menu disponivel:     |");
           System.out.println("|1- calcular imposto  |");
           System.out.println("|2- depositar salario |");
           System.out.println("|3- sair              |");
           System.out.println("-----------------------");
           menu= entrada.nextInt();

       }

    }
}
