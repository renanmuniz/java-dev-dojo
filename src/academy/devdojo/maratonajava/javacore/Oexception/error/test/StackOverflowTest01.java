package academy.devdojo.maratonajava.javacore.Oexception.error.test;

public class StackOverflowTest01 {
    public static void main(String[] args) {
        recursividade();  //Exception in thread "main" java.lang.StackOverflowError
    }

    public static void recursividade() {
        recursividade();
    }
}
