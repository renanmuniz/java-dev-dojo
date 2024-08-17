package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Calculadora;

import java.math.BigDecimal;

public class CalculadoraTest01 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        calculadora.somaDoisNumeros();
        calculadora.subtraiDoisNumeros();
        calculadora.multiplicaDoisNumeros(2,5);
        System.out.println("Divisão: " + calculadora.divideDoisNumeros(10,3));
        System.out.println("Divisão: " + calculadora.divideDoisNumeros(10,0));

        //parametros primitivos sao passador por valor
        // ou seja, eh enviado uma copia para o metodo
        int n1 = 1;
        int n2 = 2;
        calculadora.alteraDoisNumeros(n1,n2); //99 e 33
        System.out.println(n1); //1
        System.out.println(n2); //2
    }
}
