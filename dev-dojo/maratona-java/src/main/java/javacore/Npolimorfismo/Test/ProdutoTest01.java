package javacore.Npolimorfismo.Test;

import javacore.Npolimorfismo.dominio.Computador;
import javacore.Npolimorfismo.dominio.Televisao;
import javacore.Npolimorfismo.dominio.Tomate;
import javacore.Npolimorfismo.servico.CalculadoraImposto;

public class ProdutoTest01 {
    public static void main(String[] args) {
        Computador computador = new Computador("Ibyte Active 7SE", 1400);
        Tomate tomate = new Tomate("Tomate Cereja", 5);
        Televisao tv = new Televisao("Samsung 50\" ", 5000);


        CalculadoraImposto.calcularImposto(computador);
        System.out.println("---------------------------------------------");
        CalculadoraImposto.calcularImposto(tomate);
        System.out.println("---------------------------------------------");
        CalculadoraImposto.calcularImposto(tv);
    }
}
