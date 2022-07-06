package com.example.maratonajava;

public class Aula06EstruturasDeRepeticao04 {
    public static void main(String[] args) {
        // Dado o valor de um carro, descubra em quantas ele pode ser parcelado
        // Condição valorParcela >= 1000
        double valorTotal = 30000;
        for (int parcela = 1; parcela < valorTotal; parcela++) {
            double valorParcela = valorTotal / parcela;
            // if (valorParcela < 1000) #### dessa forma economizaria linhas de códigos.
            // System.out.println("Parcela "+ parcela+ " R$ "+valorParcela);
            if (valorParcela >= 1000) {
                System.out.println("Parcela " + parcela + " R$ " + valorParcela);
            } else {
                break;
            }
            System.out.println("Fora do if, mas dentro do for " + parcela);
        }
    }
}
