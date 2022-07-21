package javacore.Eblocosinicialização.dominio;

public class Anime {
    private String nome;
    private int[] episodios;
    // 1 - Alocado espaço na memoria pro objeto
    // 2 - Cada atributo de classe é inicializao com valores default ou o que for passada
    // 3 - Bloco de inicialização é executado
    // 4 - Construtor é executado
    {
        System.out.println("Dentro do bloco de inicialização");
        episodios = new int[100];
        for (int i = 0; i < episodios.length; i++) {
            episodios[i] = i + 1;
        }
    }
    public Anime(String nome){
        this.nome = nome;
    }

    public Anime() {

        for (int episodio: this.episodios) {
            System.out.print(episodio + " ");
        }
        System.out.println();
    }

    public String getNome() {
        return nome;
    }

    public int[] getEpisodios() {
        return episodios;
    }
}