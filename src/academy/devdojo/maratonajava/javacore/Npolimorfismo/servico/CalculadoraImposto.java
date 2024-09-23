package academy.devdojo.maratonajava.javacore.Npolimorfismo.servico;

import academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Produto;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Tomate;

public class CalculadoraImposto {
//    public static void calcularImpostoComputador(Computador computador) {
//        System.out.println("Relatorio de imposto do computador");
//        double imposto = computador.calcularImposto();
//        System.out.println("IMPOSTO DO COMPUTADOR: " + computador.getNome() + " de: R$" + computador.getValor() + " é de: R$" + imposto);
//    }
//
//    public static void calcularImpostoTomate(Tomate tomate) {
//        System.out.println("Relatorio de imposto do tomate");
//        double imposto = tomate.calcularImposto();
//        System.out.println("IMPOSTO DO TOMATE: " + tomate.getNome() + " de: R$" + tomate.getValor() + " é de: R$" + imposto);
//    }
//
//        public static void calcularImpostoTelevisao(Televisao televisao) {
//        System.out.println("Relatorio de imposto da televisao");
//        double imposto = televisao.calcularImposto();
//        System.out.println("IMPOSTO DA TELEVISAO: " + televisao.getNome() + " de: R$" + televisao.getValor() + " é de: R$" + imposto);
//    }

    public static void calcularImposto(Produto produto) {
        System.out.println("Relatorio de imposto");
        double imposto = produto.calcularImposto();
        System.out.println("IMPOSTO DO PRODUTO: " + produto.getNome() + " de: R$" + produto.getValor() + " é de: R$" + imposto);
        if(produto instanceof Tomate) {
            Tomate tomate = (Tomate) produto;
            System.out.println("Validade: " + tomate.getValidade());
        }
    }
}
