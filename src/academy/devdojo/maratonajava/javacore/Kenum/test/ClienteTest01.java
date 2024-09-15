package academy.devdojo.maratonajava.javacore.Kenum.test;

import academy.devdojo.maratonajava.javacore.Kenum.dominio.Cliente;
import academy.devdojo.maratonajava.javacore.Kenum.dominio.TipoCliente;
import academy.devdojo.maratonajava.javacore.Kenum.dominio.TipoPagamento;

import static academy.devdojo.maratonajava.javacore.Kenum.dominio.TipoCliente.PESSOA_FISICA;
import static academy.devdojo.maratonajava.javacore.Kenum.dominio.TipoCliente.PESSOA_JURIDICA;
import static academy.devdojo.maratonajava.javacore.Kenum.dominio.TipoPagamento.CREDITO;
import static academy.devdojo.maratonajava.javacore.Kenum.dominio.TipoPagamento.DEBITO;

public class ClienteTest01 {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Jose", PESSOA_FISICA, CREDITO);
        Cliente cliente2 = new Cliente("Loja do Jose", PESSOA_JURIDICA, DEBITO);
//        Cliente cliente3 = new Cliente("Loja do Jose", PJ);  erro, nao existe PJ
        System.out.println(cliente1);
        System.out.println(cliente2);

        System.out.println("DESCONTO: " + DEBITO.calcularDesconto(100));
        System.out.println("DESCONTO: " + CREDITO.calcularDesconto(100));
        System.out.println(TipoCliente.valueOf("PESSOA_FISICA"));
        System.out.println(TipoCliente.tipoClientePorDescritivo("Pessoa Física"));
    }
}
