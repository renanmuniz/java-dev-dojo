package academy.devdojo.maratonajava.javacore.Oexception.runtime.test;

import java.io.FileNotFoundException;
import java.io.IOException;

public class RuntimeExceptionTest04 {
    public static void main(String[] args) {
        try {
            System.out.println("código executando...");
            throw new IndexOutOfBoundsException("index out of bounds");
        } catch (ArrayIndexOutOfBoundsException | ClassCastException e) {  // catch de mais de uma excecao em uma linha só podem em casos de exceção que não sejam da mesma linha de herança
            System.out.println("Dentro do ArrayIndexOutOfBoundsException | ClassCastException");
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Dentro do IndexOutOfBoundsException");
        } //catch (IOException | FileNotFoundException e) {
//            System.out.println(Nao compila pois as duas excecoes sao da mesma linha de herança);
//        }

    }
}
