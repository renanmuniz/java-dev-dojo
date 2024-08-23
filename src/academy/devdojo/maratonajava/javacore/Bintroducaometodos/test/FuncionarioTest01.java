package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Funcionario;

public class FuncionarioTest01 {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();
        funcionario.setNome("jose");
        funcionario.setIdade(35);
        funcionario.setSalarios(new double[]{2000.0, 3000.0, 4000.0});

        funcionario.imprime();
        System.out.println("Media: " + funcionario.getMedia());
    }
}
