package com.cavalcante.logica.java.LogicaDevDojo.Arrays.Bidimensional;

public class ArrayB02 {
    public static void main(String[] args) {
//        calculando a diagonal principal com array multidimencionais

        int [][] arrayMulti = new int [3] [3];

        arrayMulti [0] [0] = 22;
        arrayMulti [0] [1] = 11;
        arrayMulti [0] [2] = 4;
        arrayMulti [1] [0] = 44;
        arrayMulti [1] [1] = 55;
        arrayMulti [2] [2] = 9;
        arrayMulti [2] [0] = 2;
        arrayMulti [2] [1] = 5;
        arrayMulti [2] [2] = 21;
        //R= 25,410
            int resultadoDiagonalPrincipal = 0;
        for (int i = 0; i < arrayMulti.length; i++) {
            for (int j = 0; j < arrayMulti[i].length; j++) {
                if (i==j){
                    resultadoDiagonalPrincipal = resultadoDiagonalPrincipal * arrayMulti[i] [j];
                }
            }
        }

    }
}
