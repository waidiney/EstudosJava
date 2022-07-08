package javacore.Bintroducaometodos.test;

import javacore.Bintroducaometodos.dominio.Funcionario;

public class FuncionarioTeste01 {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();
        funcionario.setNome ("Waidy");
        funcionario.setIdade(34);
        funcionario.setSalarios(new double[]{1200, 987.32, 2000});
        funcionario.imprime();
        System.out.println("Média " + funcionario.getMedia() );
    }
}