package javacore.Gassociacao.dominio;

public class Estagiario {
    private String nome;

    public void imprime() {
        System.out.println(this.nome);
    }

    public Estagiario(String nome) {
        this.nome = nome;
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
