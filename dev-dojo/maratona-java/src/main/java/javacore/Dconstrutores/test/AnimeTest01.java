package javacore.Dconstrutores.test;

import javacore.Dconstrutores.dominio.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime();
        anime.init("Dr.Stone","TV",12);
        anime.init("Dr.Stone","TV",12,"Ação");
        anime.setGenero("Ação");
        anime.imprime();
     }
}