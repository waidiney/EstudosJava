package javacore.Jmodificadorfinal.dominio;

public class Carro {
    private String nome;
    public static final double VELOCIDADE_LIMITE = 250;
// Toda constante tem que ser escrita em capslock e sepera as palavras com _ e geralmente vem acompanhado de um modificador statico, esta constante por sua vez e usado quando nao querremos alterar o valor da variavel    
        public String getNome() {
                return nome;
        }

        public void setNome(String nome) {
                this.nome = nome;
        }
}