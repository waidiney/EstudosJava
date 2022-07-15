package javacore.Dconstrutores.test;

import javacore.Dconstrutores.dominio.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime();
        anime.setNome("Dr.Stone");
        anime.setTipo("TV");
        anime.setEpisodios(12);
        anime.imprime();
     }
}