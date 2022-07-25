package javacore.Gassociacao.test;

import javacore.Gassociacao.dominio.Estagiario;

public class EstagiarioTest01 {
    public static void main(String[] args) {
        Estagiario estagiario1 = new Estagiario("Waidiney");
        Estagiario estagiario2 = new Estagiario("Deivison");
        Estagiario estagiario3 = new Estagiario("Sam");
        Estagiario [] estagiarios = {estagiario1, estagiario2, estagiario3};
        for (Estagiario estagiario : estagiarios){
            estagiario.imprime();
        }
    }
}
