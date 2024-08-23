package academy.devdojo.maratonajava.javacore.Dconstrutores.test;

import academy.devdojo.maratonajava.javacore.Dconstrutores.dominio.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime("Dragon Ball Z","TV", 200, "acao");
        anime.imprime();

        Anime anime2 = new Anime("Pokemon","TV", 300, "aventura/ação");
        anime2.imprime();

        Anime anime3 = new Anime();
        anime3.imprime();
    }
}
