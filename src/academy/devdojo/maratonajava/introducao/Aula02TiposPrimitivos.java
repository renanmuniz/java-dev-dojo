package academy.devdojo.maratonajava.introducao;

public class Aula02TiposPrimitivos {
    public static void main(String[] args) {
        //int, double, float, char, byte, short, long, boolean
        int idade = 10;
        long numeroGrande = 10000000000L;
        double salario = 2000.00;
        float salarioFloat = 2500.00F;
        byte idadeByte = 10;
        short idadeShort = 10;
        boolean verdadeiro = true;
        boolean falso = false;
        char caractere = 'A';
        char caractereAscii = 65;

        System.out.println("Idade é: " + idade + " anos.");
        System.out.println("Imprimindo caractere: " + caractere);
        System.out.println("Imprimindo caractere ascii: " + caractereAscii);


        //String - nao e um tipo primitivo!
        String nome = "Renan";
        System.out.println("Nome é: " + nome);

        //Inferencia de tipos:
        var nomeInferido = "Renan";
        System.out.println("Nome Inferido é: " + nomeInferido);
        System.out.println(nomeInferido.getClass());
    }
}
