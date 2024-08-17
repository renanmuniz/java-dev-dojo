package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.test;

import academy.devdojo.maratonajava.javacore.Aintroducaoclasses.dominio.Estudante;

public class EstudanteTest01 {
    public static void main(String[] args) {
        Estudante estudante = new Estudante();
        estudante.nome = "Renan";
        estudante.idade = 34;
        estudante.sexo = 'M';

        System.out.println(estudante); //academy.devdojo.maratonajava.javacore.introducaoclasses.dominio.Estudante@2a84aee7  isso é o ID do objeto na memoria

        System.out.println(estudante.nome); //Renan
        System.out.println(estudante.idade); //34
        System.out.println(estudante.sexo); //M


    }


}
