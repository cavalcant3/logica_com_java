package com.cavalcante.logica.java.LogicaDevDojo.Básico;
/* Se o salario for maior que 4500 imprima 30%, senão imprima 15% */

import java.util.Scanner;

public class SalarioIf {
    public static void main(String[] args) {
        float salario;
        double resultado;

        Scanner entrada = new Scanner(System.in);
        System.out.println("informe seu salário:");
        salario = entrada.nextFloat();

        if (salario > 4500) {

            resultado = salario * 0.3;
            System.out.println("O resultado é:" + resultado);
        } else {

            resultado = salario * 0.15;
            System.out.println("O resultado é:" + resultado);
        }
    }
}
