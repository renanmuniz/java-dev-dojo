package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Pessoa;

public class PessoaTest01 {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();

        pessoa.setNome("jose");
        pessoa.setIdade(18);
        pessoa.imprime();

//        pessoa.idade = -1; nao tem mais visibilidade, agora é private
        pessoa.setIdade(-1);
        pessoa.imprime();
        System.out.println("Nome pelo getNome: " + pessoa.getNome());
        System.out.println("Idade pelo getIdade: " + pessoa.getIdade());
    }
}
