package com.cavalcante.logica.java.LogicaDevDojo.SwitchCase;

public class DiasDaSemanaSwitch {
    public static void main(String[] args) {
        int dia = 7;

        switch(dia){
            case 1:
                System.out.println("Hoje é domingo!");
                break;
            case 2:
                System.out.println("Hoje é segunda");
                break;
            case 3:
                System.out.println("Hoje é terça");
                break;
            case 4:
                System.out.println("Hoje é quarta");
                break;
            case 5:
                System.out.println("Hoje é quinta");
                break;
            case 6:
                System.out.println("Hoje é sexta");
                break;
            case 7:
                System.out.println("Hoje é sábado");
                break;
            default:
                System.out.println("Dia inválido");
                break;
        }
    }
}
