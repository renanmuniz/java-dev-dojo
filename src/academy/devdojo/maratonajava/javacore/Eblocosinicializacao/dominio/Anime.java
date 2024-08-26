package academy.devdojo.maratonajava.javacore.Eblocosinicializacao.dominio;

import java.time.LocalDateTime;

public class Anime {
    private String nome;
    private int[] episodios;

    {
        System.out.println(LocalDateTime.now() + " Isso é um bloco de inicialização!");
        System.out.println(LocalDateTime.now() + " Ele é executado antes mesmo do construtor.");
    }

    public Anime() {
        System.out.println(LocalDateTime.now() + " Executando o construtor!");
    }
}
