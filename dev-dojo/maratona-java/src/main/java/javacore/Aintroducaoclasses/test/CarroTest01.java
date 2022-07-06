package javacore.Aintroducaoclasses.test;

import javacore.Aintroducaoclasses.dominio.Carro;

public class CarroTest01 {
    public static void main(String[] args) {
      Carro carro01 = new Carro();
      Carro carro02 = new Carro();

      carro01.nome = "Uno Mile";
      carro01.modelo = "Economy";
      carro01.ano = 2013;

        carro02.nome = "Mustang";
        carro02.modelo = "GT 500";
        carro02.ano = 1968;

        carro02 = carro01;

        System.out.println("carro 01");
        System.out.println(carro01.nome);
        System.out.println(carro01.modelo);
        System.out.println(carro01.ano);

        System.out.println("\ncarro 02");
        System.out.println(carro02.nome);
        System.out.println(carro02.modelo);
        System.out.println(carro02.ano);


    }
}
