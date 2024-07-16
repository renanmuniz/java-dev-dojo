package academy.devdojo.maratonajava.introducao;

public class Aula04Operadores {
    public static void main(String[] args) {
        // + - / *
        int numero01 = 10;
        int numero02 = 20;
        System.out.println(numero01 + numero02);
        System.out.println(numero02 - numero01);

        int resultado = numero01 + numero02;
        System.out.println(resultado);

        int resultado2 = numero01 * numero02;
        System.out.println(resultado2);

        int resultado3 = numero02 / numero01;
        System.out.println(resultado3);

        System.out.println(numero01/numero02); //resultado é 0 e não 0.5 porque estamos dividindo inteiros então resultado é inteiro.
        System.out.println((float)numero01/(float)numero02); //0.5


        // Operador módulo %
        System.out.println(20 % 2); //0
        System.out.println(20 % 3); //2


        // Operadores relacionais:
        // retornam sempre boolean
        // > maior  > menor    >= maior e igual   <= menor e igual  == igual  != diferente

        System.out.println(10 > 20);  //false
        System.out.println(10 < 20);  //true
        System.out.println(10 > 10);  //false
        System.out.println(10 >= 10);  //true
        System.out.println(10 < 10);  //false
        System.out.println(10 <= 10);  //true
        System.out.println(10 == 10);  //true
        System.out.println(10 == 20);  //false
        System.out.println(10 != 20);  //true

        //IMPORTANTE!
        //Pode comparar tipos diferentes desde que sejam comparáveis:
        int a = 10;
        double b = 10.0;
        System.out.println(a == b);  //true

//        System.out.println(10 == "10"); //Operator '==' cannot be applied to 'int', 'java.lang.String




    }
}
