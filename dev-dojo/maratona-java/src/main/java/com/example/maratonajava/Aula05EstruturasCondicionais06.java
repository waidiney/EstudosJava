package com.example.maratonajava;

public class Aula05EstruturasCondicionais06 {
    public static void main(String[] args) {
        // Ultilizando switch e dados os valores de 1 a 7 , imprima se é útil ou final de semana.
        // Considerando 1 como domingo
        byte dia = 7;
        switch (dia) {
            case 1:
            case 7:
                System.out.println("FDS");
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                System.out.println("Dia útil");
                break;
            default:
                System.out.println("Opção Inválida");
                break;
            }
        }
    }