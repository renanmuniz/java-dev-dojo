package academy.devdojo.maratonajava.javacore.Hheranca.dominio;

public class Funcionario extends Pessoa {
    private double salario;

    public void imprime() {
        super.imprime(); //super faz referencia a classe pai da herança
        System.out.println("Metodo imprime da classe Funcionario:");
//        System.out.println(super.getNome());
//        System.out.println(super.getCpf());
//        System.out.println(super.getEndereco().getRua() + " " + super.getEndereco().getCep());
        System.out.println(salario);
    }

    public void relatorioPagamento() {
        System.out.println("Eu, " + this.nome + " recebi o salario de R$" + this.salario);
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
