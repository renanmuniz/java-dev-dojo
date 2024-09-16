package academy.devdojo.maratonajava.javacore.Npolimorfismo.servico;

import academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Computador;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Tomate;

public class CalculadoraImposto {
    public static void calcularImpostoComputador(Computador computador) {
        System.out.println("Relatorio de imposto do computador");
        double imposto = computador.calcularImposto();
        System.out.println("IMPOSTO DO COMPUTADOR: " + computador.getNome() + " de: R$" + computador.getValor() + " é de: R$" + imposto);
    }

    public static void calcularImpostoTomate(Tomate tomate) {
        System.out.println("Relatorio de imposto do tomate");
        double imposto = tomate.calcularImposto();
        System.out.println("IMPOSTO DO TOMATE: " + tomate.getNome() + " de: R$" + tomate.getValor() + " é de: R$" + imposto);
    }
}
