package javacore.Gassociacao.test;

import javacore.Gassociacao.dominio.Aluno;
import javacore.Gassociacao.dominio.Local;
import javacore.Gassociacao.dominio.Professor;
import javacore.Gassociacao.dominio.Seminario;

public class AssociacaoTeste {
    public static void main(String[] args) {
        Local local = new Local("Rua Patativas");
        Aluno aluno = new Aluno("Keitarõ", 19);
        Professor professor = new Professor("Wilian Suane", "Progamação");
        Aluno[] alunosParaSeminário = {aluno};
        Seminario seminario = new Seminario("Maratona Java", alunosParaSeminário, local);
        Seminario[] seminariosDisponiveis = {seminario};
        professor.setSeminarios(seminariosDisponiveis);
        professor.imprime();
    }
}
