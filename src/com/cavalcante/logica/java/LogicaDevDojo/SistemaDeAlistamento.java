package com.cavalcante.logica.java.LogicaDevDojo;

import java.util.Scanner;

public class SistemaDeAlistamento {
    public static void main(String[] args) {

        String sexo;
        int idade;
        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe o sexo:");
        sexo = entrada.next();
        System.out.println("Informe a idade:");
        idade = entrada.nextInt();

        //validação
        if (sexo.equalsIgnoreCase("masculino") && idade>= 18){
            System.out.println("alistamento obrigatorio");
        } else if(sexo.equalsIgnoreCase("masculino") && idade< 18){
            System.out.println("Alistamento não permitido");
        } else if(sexo.equalsIgnoreCase("feminino") && idade>= 18){
            System.out.println("Deseja se alistar?");
        } else if(sexo.equalsIgnoreCase("feminino") && idade<18){
            System.out.println("Alistamento não permitido");

        }

        //correção
      /*  if ((sexo == "masculino" || sexo == "feminino" ) && idade < 18){
            System.out.println("Alistamento não permitido");
        } else if (sexo == "masculino" && idade>=18){
            System.out.println("Alistamento obrigatorio");
        }else if (sexo == "feminino" && idade>=18){
            System.out.println("deseja se alistar");
        } */


    }
}
