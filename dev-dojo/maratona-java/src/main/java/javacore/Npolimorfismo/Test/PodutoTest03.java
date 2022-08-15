package javacore.Npolimorfismo.Test;

import javacore.Npolimorfismo.dominio.Computador;
import javacore.Npolimorfismo.dominio.Produto;
import javacore.Npolimorfismo.dominio.Tomate;
import javacore.Npolimorfismo.servico.CalculadoraImposto;

public class PodutoTest03 {
    public static void main(String[] args) {
        Produto produto = new Computador("COMPAQ LIXO", 1000);

        Tomate tomate = new Tomate("Tomate de fresco e frisco", 5);
        tomate.setDataValidade("10/09/2022");
        CalculadoraImposto.calcularImposto(tomate);
        CalculadoraImposto.calcularImposto(produto);
    }
}
