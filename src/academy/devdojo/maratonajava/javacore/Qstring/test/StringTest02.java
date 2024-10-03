package academy.devdojo.maratonajava.javacore.Qstring.test;

public class StringTest02 {
    public static void main(String[] args) {
        String nome = "Renan";

        System.out.println(nome.charAt(0)); //R
//        System.out.println(nome.charAt(100)); //String index out of bounds exception
        System.out.println(nome.length()); //Retorna tamanho do array = 5

        System.out.println(nome.replace('n','N')); //ReNaN

        System.out.println(nome.toLowerCase()); //renan

        System.out.println(nome.toUpperCase()); //RENAN

        String nomeCompleto = "Renan Muniz";
        System.out.println(nomeCompleto.substring(0,5)); //Renan  0 indice onde quer iniciar e 5 é indice onde quer terminar *EXCLUSIVE*

        String nomeComValorEmBrancoNoComecoEFim = " Renan Muniz ";
        System.out.println(nomeComValorEmBrancoNoComecoEFim.trim()); //"Renan Muniz"

        
    }
}
