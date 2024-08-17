package academy.devdojo.maratonajava.introducao;

public class Aula07Arrays {
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

        //tambem pode declarar assim:
        int[] numeros = {1,2,3,4,5,6,7,8,9,10};


        for(int n : numeros) {
            System.out.println("numero: " + n);
        }


        //matriz
        int n = 0;
        int[][] dias = new int[12][3];
        for(int linha=0; linha<12; linha++) {
            for(int coluna=0; coluna<3; coluna++) {
                dias[linha][coluna] = n;
                n++;
            }
        }

        for(int linha=0; linha<12; linha++) {
            for (int coluna = 0; coluna < 3; coluna++) {
                System.out.println("MATRIZ[" + linha + "]" + "[" + coluna + "]" + " = " + dias[linha][coluna]);
            }
        }
//        MATRIZ[0][0] = 0
//        MATRIZ[0][1] = 1
//        MATRIZ[0][2] = 2
//        MATRIZ[1][0] = 3
//        ...
        
    }
}
