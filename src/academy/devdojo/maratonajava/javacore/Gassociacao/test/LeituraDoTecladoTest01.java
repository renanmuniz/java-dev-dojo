package academy.devdojo.maratonajava.javacore.Gassociacao.test;

import java.util.Scanner;

public class LeituraDoTecladoTest01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite algo: ");
        String dados = scanner.nextLine();
        System.out.println("Dados digitados: " + dados);
    }
}
