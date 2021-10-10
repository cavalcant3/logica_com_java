package com.cavalcante.logica.java.LogicaDevDojo.Arrays.Unidimensional;

import java.util.Scanner;

public class Array04 {
    public static void main(String[] args) {
//        int[] array1 = new int[3];
//        int[] array2 = new int[3];
//        int[] array3 = new int[3];
//        Scanner entrada = new Scanner(System.in);
//        for (int i = 0; i < array1.length ; i++) {
//            System.out.println("Vetor 1, posição " + i + ": ");
//            array1[i] = entrada.nextInt();
//
//        }
//        System.out.println("----------------------------------------");
//        for (int i = 0; i < array2.length ; i++) {
//            System.out.println("Vetor 2, posição " + i + ": ");
//            array2[i] = entrada.nextInt();
//
//        }
//        System.out.println("----------------------------------------");
//        for (int i = 0; i < array3.length ; i++) {
//            System.out.println("Vetor 3, posição " + i + ": ");
//            array3[i] = array1[i] * array2[i];
//            System.out.println(array3[i]+ " de resultado");
//
//        }
        int[] array1 = new int[3];
        int[] array2 = new int[3];
        int[] array3 = new int[3];
        Scanner entrada = new Scanner(System.in);
        String resultado = "  ";
        for (int i = 0; i < array1.length ; i++) {
            System.out.println("Vetor 1, posição " + i + ": ");
            array1[i] = entrada.nextInt();
            System.out.println("Vetor 2, posição " + i + ": ");
            array2[i] = entrada.nextInt();
            array3[i] = array1[i] * array2[i];
            resultado = resultado + array3[i];

        }



   }


}
