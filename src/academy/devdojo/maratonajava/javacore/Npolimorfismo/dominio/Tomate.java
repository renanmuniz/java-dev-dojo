package academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio;

public class Tomate extends Produto {
    public static final double IMPOSTO_POR_CENTO = (double) 6/100;
    private String validade;

    public Tomate(String nome, double valor) {
        super(nome, valor);
    }

    public void setValidade(String validade) {
        this.validade = validade;
    }

    public String getValidade() {
        return validade;
    }

    @Override
    public double calcularImposto() {
        System.out.println("Calculando imposto do tomate.");
        return this.valor*IMPOSTO_POR_CENTO;
    }
}
