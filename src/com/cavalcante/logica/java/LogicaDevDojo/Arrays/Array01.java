package com.cavalcante.logica.java.LogicaDevDojo.Arrays;

public class Array01 {
    public static void main(String[] args) {
        //calculando notas com array

        // criando um array:
        double[] notas = new double[4];
        notas[0] = 7.5;
        notas[1] = 8.8;
        notas[2] = 9.7;
        notas[3] = 85.4;

        System.out.println("Tamanho do array:" + notas.length);

        for (int i = 0; i < notas.length ; i++) {
            System.out.println(notas[i]);
        }
    }
}
