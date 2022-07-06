package javacore.Aintroducaoclasses.test;

import javacore.Aintroducaoclasses.dominio.Professor;

public class ProfessorTest01 {
    public static void main(String[] args) {
        Professor professor = new Professor();
        professor.nome = "Guanabara";
        professor.idade = 50;
        professor.sexo = 'M';

        System.out.println("Nome " + professor.nome + " Idade: " + professor.idade + " sexo " + professor.sexo);

    }
}
