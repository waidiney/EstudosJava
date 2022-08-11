package javacore.Lcalssesabistratas.dominio;
// Metodos abstratos nao tem corpo, ao usar metodos abstratos voce e obrigado a colocar a implementacao nas subclasses.
public abstract class Funcionario {
    protected String nome;
    protected double salario;

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
        calculaBonus();
    }
    @Override
    public String toString() {
        return "Funcionario{" +
                "nome='" + nome + '\'' +
                ", salario=" + salario +
                '}';
    }

    public abstract void calculaBonus();
    }

