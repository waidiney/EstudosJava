package javacore.Bintroducaometodos.test;
import javacore.Bintroducaometodos.dominio.Estudante;
import javacore.Bintroducaometodos.dominio.ImpressoraEstudante;

public class EstudanteTeste01 {
    public static void main(String[] args) {
        Estudante estudante01 = new Estudante();
        Estudante estudante02 = new Estudante();
        ImpressoraEstudante impressora = new ImpressoraEstudante();

        estudante01.nome = "Keitarô";
        estudante01.idade = 15;
        estudante01.sexo = 'M';

        estudante02.nome = "Narusegawa";
        estudante02.idade = 16;
        estudante02.sexo = 'F';

        impressora.imprime(estudante01);
        impressora.imprime(estudante02);

        System.out.println("#######################################");

        impressora.imprime(estudante01);
        impressora.imprime(estudante02);
    }
}
