package javacore.Bintroducaometodos.dominio;

public class Funcionario {
    private String nome;
    private int idade;
    private double[] salarios;
    private double media = 0;
    public double getMedia() {
        return media;
    }
    public void imprime() {
        System.out.println(this.nome);
        System.out.println(this.idade);
        for (double salario : salarios) {
            System.out.print(salario + " ");
        }
        imprimeMediaSalario();
    }
    // Alt + insert mostra opção de inserir automáticamente os get's e set's em cada classe privada
    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public double[] getSalarios() {
        return salarios;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setSalarios(double[] salarios) {
        this.salarios = salarios;
    }

    public void imprimeMediaSalario() {
        double media = 0;
        for(double salario: salarios){
            media += salario;
        }
        media /= salarios.length;
        System.out.println("\nMédia salarial "+ media);
    }
}