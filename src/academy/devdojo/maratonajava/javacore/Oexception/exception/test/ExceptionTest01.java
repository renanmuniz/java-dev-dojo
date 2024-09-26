package academy.devdojo.maratonajava.javacore.Oexception.exception.test;

import java.io.File;
import java.io.IOException;

public class ExceptionTest01 {
    public static void main(String[] args) {
        //alterei a permissao de escrita na pasta no sistema operacional
        criarNovoArquivo(); //java.io.IOException: Permissão negada
    }

    private static void criarNovoArquivo() {
        File file = new File("arquivo/teste.txt");
        try {
            file.createNewFile();
            System.out.println("Arquivo criado: " + file.getName());
        } catch (IOException e) {
            System.out.println("ERRO: " + e.getMessage()); //ERRO: Permissão negada
            e.printStackTrace(); //java.io.IOException: Permissão negada
        }
    }
}
