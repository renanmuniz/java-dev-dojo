package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.test;

import academy.devdojo.maratonajava.javacore.Aintroducaoclasses.dominio.Estudante;

public class EstudanteTest02 {
    public static void main(String[] args) {
        Estudante estudante = new Estudante();

        System.out.println(estudante.nome); //null
        System.out.println(estudante.idade); //0
        System.out.println(estudante.sexo); // vazio

        estudante.nome = "Renan";
        System.out.println("---");

        System.out.println(estudante.nome); //Renan
        System.out.println(estudante.idade); //0
        System.out.println(estudante.sexo); // vazio
    }

}
