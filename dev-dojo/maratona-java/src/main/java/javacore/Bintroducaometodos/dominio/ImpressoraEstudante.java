package javacore.Bintroducaometodos.dominio;

public class ImpressoraEstudante {
    public void imprime (Estudante estudante){

        System.out.println("_____________________________________");


        System.out.println(estudante.nome);
        System.out.println(estudante.sexo);
        System.out.println(estudante.idade);

        estudante.nome = "Senku";
    }
}
