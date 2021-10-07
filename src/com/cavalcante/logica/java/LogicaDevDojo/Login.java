package com.cavalcante.logica.java.LogicaDevDojo;

/* Criar um sistema de login e fazer a validação de dados */

import java.util.Scanner;

public class Login {
    public static void main(String[] args) {
        String login;
        String senha;

        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe o nome de usuario: ");
        login = entrada.next();

        System.out.println("Informe a senha de usuario: ");
        senha = entrada.next();

        if (login.equalsIgnoreCase("admin") || login.equalsIgnoreCase("administrador") || login.equalsIgnoreCase("") ){
            System.out.println("Usuário inválido");
        } else {
            System.out.println(login + " Login feito com sucesso");
        }
    }
}
