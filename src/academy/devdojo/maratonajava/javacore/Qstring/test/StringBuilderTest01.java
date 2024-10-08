package academy.devdojo.maratonajava.javacore.Qstring.test;

public class StringBuilderTest01 {
    public static void main(String[] args) {
        String nome = "Renan";  //criou 1 posição de memória
        String b = nome.concat(" Muniz"); //criou 1 posição de memória
        System.out.println(nome); //Renan
        System.out.println(b); //Renan Muniz
        StringBuilder sb = new StringBuilder("Renan"); //criou 1 posição de memória
        System.out.println(sb);
        sb.append(" Muniz"); //Renan   //utilizou a mesma
        System.out.println(sb); //Renan Muniz
        System.out.println(sb.length()); //11
        System.out.println(sb.substring(0,5)); //Renan
        System.out.println(sb); //Renan Muniz
        StringBuilder sb2 = new StringBuilder(sb.reverse());
        System.out.println(sb2); //zinuM naneR
    }
}
