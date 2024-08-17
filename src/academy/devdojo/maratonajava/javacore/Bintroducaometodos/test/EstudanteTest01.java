package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Estudante;

public class EstudanteTest01 {
    public static void main(String[] args) {
        Estudante estudante01 = new Estudante();
        Estudante estudante02 = new Estudante();
        ImpressoraEstudante impressora = new ImpressoraEstudante();
        estudante01.nome = "jose";
        estudante01.idade = 30;
        estudante01.sexo = 'M';

        estudante02.nome = "maria";
        estudante02.idade = 25;
        estudante02.sexo = 'F';

        impressora.imprime(estudante01);
        impressora.imprime(estudante02);

        System.out.println("#######");
        System.out.println(estudante01.nome); //Elon Musk
        System.out.println(estudante02.nome); //Elon Musk

        // IMPORTANTE!!!
        // Ao passar objetos por parametro(tipo referencia), passamos o endereco
        // de memoria do objeto. E caso seja feita alguma alteracao no objeto
        // sera alterado na instancia desse objeto e nao apenas dentro do metodo
        // que o utilizou!
        // BOA PRATICA:
        // nao alterar objetos vindos como parametro em metodos!
        // se necessario, fazer uma copia e alterar a copia.
        // Deixando o original que veio por parametro inalterado!
        // pode-se utilizar parametros com acesso 'final' na assinatura dos metodos.

    }
}
