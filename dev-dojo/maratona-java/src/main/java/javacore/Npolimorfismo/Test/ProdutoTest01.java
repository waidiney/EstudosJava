package javacore.Npolimorfismo.Test;

import javacore.Npolimorfismo.dominio.Computador;
import javacore.Npolimorfismo.dominio.Tomate;
import javacore.Npolimorfismo.servico.CalculadoraImposto;

public class ProdutoTest01 {
    public static void main(String[] args) {
        Computador computador = new Computador("Ibyte Active 7SE", 1400);
        Tomate tomate = new Tomate("Tomate Cereja", 5);
        CalculadoraImposto.calcularImpostoComputador(computador);
        System.out.println("---------------------------------------------");
        CalculadoraImposto.calcularImpostoTomate(tomate);
    }
}
