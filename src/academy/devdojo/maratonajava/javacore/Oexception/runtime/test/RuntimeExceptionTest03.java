package academy.devdojo.maratonajava.javacore.Oexception.runtime.test;

public class RuntimeExceptionTest03 {
    public static void main(String[] args) {
        try {
            System.out.println("Abrindo arquivo");
            throw new Exception("Erro ao escrever no arquivo");
//            System.out.println("Escrevendo no arquivo");
        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        } finally {
            System.out.println("Fechando recurso do SO para arquivo.");
        }

    }
}
