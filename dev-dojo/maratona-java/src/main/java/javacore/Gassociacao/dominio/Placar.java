package javacore.Gassociacao.dominio;

public class Placar {
    private String nome;
    private String Jogador;
    private int Pontuação;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getJogador() {
        return Jogador;
    }

    public void setJogador(String jogador) {
        Jogador = jogador;
    }

    public int getPontuação() {
        return Pontuação;
    }

    public void setPontuação(int pontuação) {
        Pontuação = pontuação;
    }
}
