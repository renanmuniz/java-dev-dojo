package academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio;

public class Funcionario {
    public String nome;
    public int idade;
    public double[] salarios;

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

    public void mediaSalario() {
        if (this.salarios == null) {
            return;
        }
        double media = 0.0;
        for (double s : salarios) {
            media += s;
        }
        media /= salarios.length;
        System.out.println("\nMedia salarial: R$" + media);
    }
}
