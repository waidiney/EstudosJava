package javacore.Pexercicios.Test;

import javacore.Pexercicios.dominio.Carro;
import javacore.Pexercicios.dominio.Distribuidor;
import javacore.Pexercicios.dominio.Imposto;


public class ImpostoTest01 {

    public static void main(String[] args) {
        Carro carro = new Carro();
        Imposto imposto = new Imposto();
        Distribuidor distribuidor = new Distribuidor();
        System.out.println("O preco do carro com a porcetagem da distribuidora ficou em "+ carro.getValor() + distribuidor +" e com o imposto ficou em "+ carro.getValor() + imposto +" totalizando "+ carro.getValor() + imposto + distribuidor +" mil reais ");
    }
}
