package com.cavalcante.logica.java.LogicaDevDojo.SwitchCase;

import java.util.Scanner;

public class Login {
    public static void main(String[] args) {
        final String login = "Luffy";
        final String password = "ReiDosPiratas";
        Scanner entrada = new Scanner(System.in);

        while (true) {
            System.out.println("Digite seu login:");
            String loginDigitado = entrada.nextLine();
            System.out.println("Digite sua senha:");
            String passwordDigitado = entrada.nextLine();

            //validação
                //em caso de produção real não pode utilizar o .equalsIgnoreCase();
            if (login.equalsIgnoreCase(loginDigitado) && password.equalsIgnoreCase(passwordDigitado)){
                System.out.println("Acesso concedido");
                break;
            }
            System.out.println("Acesso negado");
        }
        System.out.println("Programa finalizado");
    }
}
