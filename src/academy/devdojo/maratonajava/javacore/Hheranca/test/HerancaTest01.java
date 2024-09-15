package academy.devdojo.maratonajava.javacore.Hheranca.test;

import academy.devdojo.maratonajava.javacore.Hheranca.dominio.Endereco;
import academy.devdojo.maratonajava.javacore.Hheranca.dominio.Funcionario;
import academy.devdojo.maratonajava.javacore.Hheranca.dominio.Pessoa;

public class HerancaTest01 {
    public static void main(String[] args) {
        Endereco endereco = new Endereco();
        endereco.setRua("Rua 3");
        endereco.setCep("0123456-789");

        Pessoa pessoa = new Pessoa("joao");
        pessoa.setCpf("123456789");
        pessoa.setEndereco(endereco);
        pessoa.imprime();

        System.out.println("-------------");

        Funcionario funcionario = new Funcionario("Jose");
        funcionario.setCpf("987654321-21");
        funcionario.setEndereco(endereco);
        funcionario.setSalario(2000.0);
        funcionario.imprime();
    }
}
