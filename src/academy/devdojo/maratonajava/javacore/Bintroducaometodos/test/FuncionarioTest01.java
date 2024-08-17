package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Funcionario;

public class FuncionarioTest01 {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();
        funcionario.nome = "jose";
        funcionario.idade = 35;
        funcionario.salarios = new double[]{2000.0, 3000.0, 4000.0};

        funcionario.imprime();
    }
}
