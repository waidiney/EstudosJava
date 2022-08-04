package javacore.Hherança.Test;

import javacore.Hherança.dominio.Pessoa;

public class Funcionario2 extends Pessoa {
    public Funcionario2(String nome) {
        super(nome);
    }

    public void imprime(){
        this.nome = "Sevandija";
    }
}
