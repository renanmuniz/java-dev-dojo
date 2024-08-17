package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.test;

import academy.devdojo.maratonajava.javacore.Aintroducaoclasses.dominio.Professor;

public class ProfessorTest01 {
    public static void main(String[] args) {
        Professor professor = new Professor();
        professor.nome = "Prof DR Fulano";
        professor.idade = 50;
        professor.sexo = 'M';

        System.out.println(professor); //academy.devdojo.maratonajava.javacore.introducaoclasses.dominio.Professor@2a84aee7  isso é o ID do objeto na memoria

        System.out.println(professor.nome); //Prof DR Fulano
        System.out.println(professor.idade); //50
        System.out.println(professor.sexo); //M


    }


}
