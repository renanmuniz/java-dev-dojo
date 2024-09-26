package academy.devdojo.maratonajava.javacore.Oexception.exception.test;

import java.io.File;
import java.io.IOException;

public class ExceptionTest02 {
    public static void main(String[] args) {
        //alterei a permissao de escrita na pasta no sistema operacional
        try {
            criarNovoArquivo(); //java.io.IOException: Permissão negada
        } catch (IOException e) {
            System.out.println("ERRO: " + e.getMessage()); //ERRO: Permissão negada
            e.printStackTrace(); //java.io.IOException: Permissão negada
        }
    }

    private static void criarNovoArquivo() throws IOException {
        File file = new File("arquivo/teste.txt");
        file.createNewFile();
        System.out.println("Arquivo criado: " + file.getName());

    }
}
