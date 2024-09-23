package academy.devdojo.maratonajava.javacore.Npolimorfismo.test;

import academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Computador;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Produto;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Tomate;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.servico.CalculadoraImposto;

public class ProdutoTest03 {
    public static void main(String[] args) {
        Produto produto = new Computador("DELL XPS", 5000.0);

        Tomate tomate = new Tomate("Tomate cereja", 7);
        tomate.setValidade("31/12/2024");

        CalculadoraImposto.calcularImposto(tomate);
        System.out.println("-----");
        CalculadoraImposto.calcularImposto(produto);
    }
}
