package academy.devdojo.maratonajava.introducao;

public class Aula06Arrays {
    public static void main(String[] args) {
        int[] idades = new int[3];
        for(int x=0; x<idades.length; x++) {
            System.out.println(idades[x]);
        } //0,0,0

        idades[0] = 18;
        idades[1] = 25;
        idades[2] = 42;

        for(int x=0; x<idades.length; x++) {
            System.out.println(idades[x]);
        } //18, 25, 42

//        idades[3] = 60; //Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 3 out of bounds for length 3

        
    }
}
