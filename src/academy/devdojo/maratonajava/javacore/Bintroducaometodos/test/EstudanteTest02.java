package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Estudante;

public class EstudanteTest02 {
    public static void main(String[] args) {
        Estudante estudante01 = new Estudante();
        Estudante estudante02 = new Estudante();

        estudante01.nome = "jose";
        estudante01.idade = 30;
        estudante01.sexo = 'M';

        estudante02.nome = "maria";
        estudante02.idade = 25;
        estudante02.sexo = 'F';

        estudante01.imprime();
        estudante02.imprime();

    }
}
