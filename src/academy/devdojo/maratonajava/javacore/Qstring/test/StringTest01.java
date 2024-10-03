package academy.devdojo.maratonajava.javacore.Qstring.test;

public class StringTest01 {
    public static void main(String[] args) {
        String nome = "Renan"; //String constant pool
        String nome2 = "Renan"; //aproveita a string ja criada no pool
        String nome3 = "Jose"; //cria nova string no pool
        String nome4 = nome.concat( " Muniz"); //cria nova string no pool "Renan Muniz"

        System.out.println(nome);
        System.out.println(nome2);
        System.out.println(nome3);
        System.out.println(nome4);

        System.out.println(nome == nome2);  //Comparar string com == compara a referencia do objeto
        System.out.println(nome == nome3);
        System.out.println(nome.equals(nome2)); //Comparar string com .equals compara o valor(texto)

        String nome5 = "Joao";
        String nome6 = "Joao";
        String nome7 = new String("Joao");  //Usando new String("...") aloca um novo espaço de memoria no pool

        System.out.println(nome5 == nome6); //true
        System.out.println(nome5 == nome7); //false
        System.out.println(nome6 == nome7); //false
        System.out.println(nome5.equals(nome7)); //true
        System.out.println(nome6.equals(nome7)); //true




    }
}
