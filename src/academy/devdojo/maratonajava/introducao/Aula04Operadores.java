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


        // Operadores Lógicos
        // && e
        // || ou
        // ! negação

        // &&
        double saldo = 1000.00;
        boolean autorizado = true;
        System.out.println("Transacao efetuada? " + ((saldo-900.00 >= 0) && autorizado));

        saldo = 500.00;
        autorizado = true;
        System.out.println("Transacao efetuada? " + ((saldo-900.00 >= 0) && autorizado));

        saldo = 950.00;
        autorizado = false;
        System.out.println("Transacao efetuada? " + ((saldo-900.00 >= 0) && autorizado));


        //  ||
        int idade = 18;
        boolean acompanhadoPorMaiorDeIdade = false;
        System.out.println("Pode entrar? " + (idade>=18||acompanhadoPorMaiorDeIdade));  //true

        idade = 17;
        acompanhadoPorMaiorDeIdade = false;
        System.out.println("Pode entrar? " + (idade>=18||acompanhadoPorMaiorDeIdade));  //false

        idade = 17;
        acompanhadoPorMaiorDeIdade = true;
        System.out.println("Pode entrar? " + (idade>=18||acompanhadoPorMaiorDeIdade));  //true

        idade = 18;
        acompanhadoPorMaiorDeIdade = false;
        System.out.println("Pode entrar? " + (!(idade<18)||acompanhadoPorMaiorDeIdade));  //true


        // !
        System.out.println(!true); //false
        System.out.println(!false); //true


        // Atribuicao
        // = += -= *= /= %=
        double salario = 1000.0;
        salario += 100.0;
        System.out.println(salario); //1100.0

        salario = 1000.0;
        salario -= 100.0;
        System.out.println(salario); //900.0

        salario = 1000.0;
        salario *= 2;
        System.out.println(salario); //2000.0

        salario = 1000.0;
        salario /= 2;
        System.out.println(salario); //500.0

        salario = 1000.0;
        salario %= 2;
        System.out.println(salario); //0.0


        // ++ --
        int contador = 0;
        System.out.println(contador); //0

        System.out.println(contador++); //0
        System.out.println(contador); //1
        System.out.println(++contador); //2
        //Diferenca é que usando o ++ antes ele incrementa o valor antes de retornar o valor
        //++ depois retorna o valor e depois incrementa.

    }
}
