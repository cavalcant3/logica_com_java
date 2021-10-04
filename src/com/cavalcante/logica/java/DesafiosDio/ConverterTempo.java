package com.cavalcante.logica.java.DesafiosDio;
import java.util.Scanner;
/*
Leia um valor inteiro, que é o tempo de duração em segundos de um determinado evento em uma fábrica
e informe-o expresso no formato horas:minutos:segundos.
Entrada
O arquivo de entrada contém um valor inteiro N.
Saída
Imprima o tempo lido no arquivo de entrada (segundos), convertido para horas:minutos:segundos, conforme exemplo fornecido.
*/

public class ConverterTempo {

    //complete os espaços em branco com sua solução
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sec, N;
        N = input.nextInt();
        int hour = N / 3600;

        int min = (N % 3600) / 60;
        //sec = sec-(           );
        sec = (N % 3600) % 60;
        System.out.println(hour + ":" + min + ":" + sec);
    }

}
