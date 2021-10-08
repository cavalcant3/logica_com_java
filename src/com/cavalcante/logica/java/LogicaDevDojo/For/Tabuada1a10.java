package com.cavalcante.logica.java.LogicaDevDojo.For;
// fazer automaticamente a tabuada de 1 a 10
public class Tabuada1a10 {
    public static void main(String[] args) {
        for (int fixo = 1; fixo <=10 ; fixo++) {
            System.out.println("tabuada do numero:" + fixo);
            for (int i = 1; i < 10; i++) {

                System.out.println(fixo + "X" + i + "=" + fixo*i);
            }

        }

    }
}
