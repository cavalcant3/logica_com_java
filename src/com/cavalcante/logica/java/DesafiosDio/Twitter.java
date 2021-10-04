package com.cavalcante.logica.java.DesafiosDio;
import java.io.IOException;
import java.util.Scanner;

/*

 QUESTÃO
 O microblog Twitter é conhecido por limitar as postagens em 140 caracteres.
 Conferir se um texto vai caber em um tuíte é sua tarefa.

 ENTRADA
 A entrada é uma linha de texto T (1 <= |T| <= 500).
 SAÍDA
 A saída é dada em uma única linha. Ela deve ser "TWEET" (sem as aspas) se a
 linha de texto T tem até 140 caracteres. Se T tem mais de 140 caracteres, a
 saída deve ser "MUTE".

*/
public class Twitter {
    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
        String T = leitor.nextLine();
        System.out.println(T.length() > 140 ? "MUTE" : "TWEET");
    }



}
