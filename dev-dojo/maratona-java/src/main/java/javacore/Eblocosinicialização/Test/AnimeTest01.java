package javacore.Eblocosinicialização.Test;

import javacore.Eblocosinicialização.dominio.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime("Love Hina");
        System.out.println(anime.getEpisodios());

        for (int episodio : anime.getEpisodios()) {
            System.out.print(episodio + " ");
        }
    }
}
