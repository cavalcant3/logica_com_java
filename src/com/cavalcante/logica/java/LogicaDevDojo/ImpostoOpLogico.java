package com.cavalcante.logica.java.LogicaDevDojo;

public class ImpostoOpLogico {
    public static void main(String[] args) {
        double salario = 2000;

        if(salario == 2000){
            System.out.println("salario aqui");
        } else if (salario> 2100 && salario<3000){
            System.out.println("salario dentro do else if");
        } else if(salario>=3100 && salario <=4000){
            System.out.println("salario dentro do segundo else if");
        } else{
            System.out.println("salario fora");
        }
    }
}
