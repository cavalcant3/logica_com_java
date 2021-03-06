package com.cavalcante.logica.java.DesafiosDio;
import java.util.Scanner;

/*Desafio
Para ajudar a calcular as notas referentes às duas avaliações dos alunos, uma professora pediu para que você desenvolva um programa que calcule e imprima a média semestral. Faça com que o algoritmo só aceite notas válidas (uma nota válida deve pertencer ao intervalo [0,10]). Cada nota deve ser validada separadamente.

Entrada
A entrada contém vários valores reais, positivos ou negativos. O programa deve ser encerrado quando forem lidas duas notas válidas.

Saída
Se uma nota inválida  for lida, deve ser impressa a mensagem "nota invalida".
Quando duas notas válidas forem lidas, deve ser impressa a mensagem "media = " seguido do valor do cálculo. O valor deve ser apresentado com duas casas após o ponto decimal.
*/

public class CalcularNotas {

    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        double notas[] = new double[2];
        int cont = 0;

        double nota;

        while (cont <= 1) {
            nota = input.nextDouble();

            if (nota < 0 || nota > 10) {
                System.out.println("nota invalida");
            } else {
                notas[cont++] = nota;
            }

        }

        double media = (notas[0] + notas[1]) / 2;

        System.out.println("media = " + String.format("%.2f", media));

    }

}
