package javacore.Bintroducaometodos.dominio;

public class Funcionario {
    private String nome;
    private int idade;
    private double[] salarios;
    private double media;

    public void imprime() {
        System.out.println(this.nome);
        System.out.println(this.idade);
        if (salarios == null) {
            return;
        }

        for (double salario : salarios) {
            System.out.println(salario + " ");
        }
        imprimeMediaSalario();
        {
            if (salarios == null) {
                return;
            }
            for (double salario : salarios) {
                media /= salarios.length;
                System.out.println("\nMédia salarial " + media);
            }
        }
    }

    private void imprimeMediaSalario() {
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

    public double getMedia() {
        return media;
    }

}
