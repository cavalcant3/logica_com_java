package com.cavalcante.logica.java.LogicaDevDojo.SwitchCase;

import java.util.Scanner;

public class PorcentagemDeJuros {
    public static void main(String[] args) {
//        int CPoupanca;
//        int CCorrente;
//        int CInvestimento;
        int a;
        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe o tipo de conta:");
        a = entrada.nextInt();

        switch (a) {
            case 1:
                System.out.println("Conta poupança: 0.05%");
                break;
            case 2:
                System.out.println("Conta corrente: 0.02%");
                break;
            case 3:
                System.out.println("Conta investimento: 0.01%");
                break;
        }

    }
}
