package academy.devdojo.maratonajava.javacore.Oexception.exception.test;

import academy.devdojo.maratonajava.javacore.Oexception.dominio.LoginInvalidoException;

import java.util.Scanner;

public class LoginInvalidoExceptionTest {
    public static void main(String[] args) {
        try {
            logar();
        } catch (LoginInvalidoException e) {
            e.printStackTrace();
        }
    }

    private static void logar() throws LoginInvalidoException {
        Scanner scanner = new Scanner(System.in);
        String username = "admin";
        String password = "123";
        System.out.println("Usuário");
        String userDigitado = scanner.nextLine();
        System.out.println("Senha");
        String senhaDigitada = scanner.nextLine();
        if(!username.equals(userDigitado) || !password.equals(senhaDigitada)) {
            throw new LoginInvalidoException("Usuário ou Senha Inválidos");
        }
        System.out.println("Usuário logado com sucesso.");

    }
}
