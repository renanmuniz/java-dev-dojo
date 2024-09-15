package academy.devdojo.maratonajava.javacore.Isobrescrita.test;

import academy.devdojo.maratonajava.javacore.Isobrescrita.dominio.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime("DragonBall Z");
        //antes de sobrescrever toString:
        System.out.println(anime); //academy.devdojo.maratonajava.javacore.Isobrescrita.dominio.Anime@2a84aee7
        //depois de sobrescrever toString:
        System.out.println(anime.toString()); //Anime{nome='DragonBall Z'}
    }
}
