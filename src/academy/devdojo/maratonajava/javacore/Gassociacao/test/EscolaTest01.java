package academy.devdojo.maratonajava.javacore.Gassociacao.test;

import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Escola;
import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Professor;

public class EscolaTest01 {
    public static void main(String[] args) {
        Professor p1 = new Professor("Joao");
        Professor p2 = new Professor("Maria");
        Professor[] professores = {p1,p2};
        Escola e = new Escola("CENTRO EDUCACIONAL X", professores);
        e.imprime();
    }
}
