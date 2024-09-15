package academy.devdojo.maratonajava.javacore.Jmodificadorfinal.test;

import academy.devdojo.maratonajava.javacore.Jmodificadorfinal.dominio.Carro;
import academy.devdojo.maratonajava.javacore.Jmodificadorfinal.dominio.Comprador;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro carro = new Carro();
        Comprador comprador2 = new Comprador();
//        carro.COMPRADOR = comprador2;
        carro.COMPRADOR.setNome("joao");
        System.out.println(carro.toString());
        System.out.println(Carro.VELOCIDADE_LIMITE);
    }
}
