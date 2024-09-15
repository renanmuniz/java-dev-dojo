package academy.devdojo.maratonajava.javacore.Lclassesabstratas.test;

import academy.devdojo.maratonajava.javacore.Lclassesabstratas.dominio.Desenvolvedor;
import academy.devdojo.maratonajava.javacore.Lclassesabstratas.dominio.Funcionario;
import academy.devdojo.maratonajava.javacore.Lclassesabstratas.dominio.Gerente;

public class FuncionarioTest01 {
    public static void main(String[] args) {
//        Funcionario funcionario = new Funcionario("Jose", 2000.0); Classes abstratas NAO podem ser instanciadas! Apenas as classes que herdam dela.
        Gerente gerente = new Gerente("Joao", 10000.0);
//        System.out.println(funcionario);
        System.out.println(gerente);
        Desenvolvedor desenvolvedor = new Desenvolvedor("Paulo", 3000.0);
        System.out.println(desenvolvedor);

    }
}
