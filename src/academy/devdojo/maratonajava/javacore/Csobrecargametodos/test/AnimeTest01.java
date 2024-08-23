package academy.devdojo.maratonajava.javacore.Csobrecargametodos.test;

import academy.devdojo.maratonajava.javacore.Csobrecargametodos.dominio.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime();
        anime.init("Dragon Ball Z","TV", 200);
        anime.imprime();

        Anime anime2 = new Anime();
        anime2.init("Pokemon","TV", 300, "aventura/ação");
        anime2.imprime();
    }
}
