package academy.devdojo.maratonajava.introducao;

import java.time.LocalDate;

public class Aula03TiposPrimitivosExercicio {
    public static void main(String[] args) {
        String nome = "Renan";
        String endereco = "Rua 1";
        double salario = 2000.00;
        LocalDate data = LocalDate.now();

        System.out.println("Eu " + nome + ", morando no endereço " + endereco + ", \nconfirmo que recebi o salário de R$" + salario + ", na data " + data + ".");
    }
}
