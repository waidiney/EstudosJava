package javacore.Gassociacao.test;

import javacore.Gassociacao.dominio.Escola;
import javacore.Gassociacao.dominio.Professor;

public class EscolaTest01 {
    public static void main(String[] args) {
        Professor professor1 = new Professor("Gustavo Guanabara");
        Professor professor2 = new Professor("Willian Suane");
        Professor[] professores = {professor1, professor2};
        Escola escola = new Escola("Curso em video", professores);
        escola.imprime();
    }
}
