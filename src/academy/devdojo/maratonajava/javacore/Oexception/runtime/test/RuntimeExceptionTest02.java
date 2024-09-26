package academy.devdojo.maratonajava.javacore.Oexception.runtime.test;


public class RuntimeExceptionTest02 {
    public static void main(String[] args) {
        try {
            int resultado = divisao(1, 0);
            System.out.println("Resultado: " + resultado); //java.lang.IllegalArgumentException: Argumento ilegal, não pode dividir por zero.
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("fim.");
    }

    private static int divisao(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Argumento ilegal, não pode dividir por zero.");
        }
        return a / b;
    }
}
