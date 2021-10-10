package com.cavalcante.logica.java.LogicaDevDojo.Arrays.Unidimensional;

import java.util.Scanner;

public class Array02 {
    public static void main(String[] args) {
       double[] notas = new double[4];
       Scanner entrada = new Scanner(System.in);
        double media = 0;
        for (int i = 0; i < notas.length ; i++) {
            System.out.println("Digite a nota:" + (i+1));
          notas[i] = entrada.nextDouble();
            media = media + notas[i];
            media = media/notas.length;
        }
        System.out.println("Essa é a media:" + media);

//        for (int i = 0; i < notas.length; i++) {
//
//            System.out.println("Essa são as notas:" + notas[i]);
//
//
//        }

    }
}
