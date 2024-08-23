package academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio;

public class Pessoa {
    private String nome;
    private int idade;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        if(idade<0) {
            System.out.println("Idade invalida: " + idade);
            return;
        }
        this.idade = idade;
    }

    public void imprime() {
        System.out.println("nome: " + getNome());
        System.out.println("idade: " + getIdade());
    }

}
