package academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio;

public class Funcionario {
    private String nome;
    private int idade;
    private double[] salarios;
    private double media = 0.0;

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
        this.idade = idade;
    }

    public double[] getSalarios() {
        return salarios;
    }

    public void setSalarios(double[] salarios) {
        this.salarios = salarios;
    }

    public double getMedia() {
        return media;
    }

    public void imprime() {
        System.out.println(this.nome);
        System.out.println(this.idade);
        if (this.salarios != null) {
            for (Double s : salarios) {
                System.out.print("R$" + s + " ");
            }
        }
        mediaSalario();
    }

    public double mediaSalario() {
        if (this.salarios == null) {
            return 0.0;
        }
        double media = 0.0;
        for (double s : salarios) {
            media += s;
        }
        media /= salarios.length;
        this.media = media;
        System.out.println("\nMedia salarial: R$" + media);
        return media;
    }
}
