package academy.devdojo.maratonajava.javacore.Oexception.exception.test;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class TryWithResourcesTest01 {
    public static void main(String[] args) {
        lerArquivo();
    }

    // Try with resources fecha automaticamente o recurso alocado, seja uma conexão de rede/banco de dados/socket/arquivo...
    //sintaxe é declarar dentro do parentesis do try:
    public static void lerArquivo() {
        try(Reader reader = new BufferedReader(new FileReader("teste.txt"))) {
            System.out.println("Trabalhando com o arquivo");
        } catch (IOException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }

}
