package javacore.Jmodificadorfinal.test;

import javacore.Jmodificadorfinal.dominio.Carro;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro carro = new Carro();
        System.out.println(Carro.VELOCIDADE_LIMITE);
        carro.COMPRADOR.setNome("Jaspion");
        System.out.println(carro.COMPRADOR);

    }
}
