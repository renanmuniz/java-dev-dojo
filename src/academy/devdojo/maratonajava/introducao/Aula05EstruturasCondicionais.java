package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais {
    public static void main(String[] args) {

        //if
        if(true) {
            System.out.println("Dentro do if");
        } else {
            System.out.println("Dentro do else");
        }

        int idade = 17;
        if(idade>=18) {
            System.out.println("Entrada permitida");
        } else {
            System.out.println("Entrada não permitida");
        }

        idade = 18;
        if(idade>=18) {
            System.out.println("Entrada permitida");
        } else {
            System.out.println("Entrada não permitida");
        }

        boolean isMaiorDeIdade = idade >= 18;
        if(isMaiorDeIdade) {
            System.out.println("Entrada permitida");
        } else {
            System.out.println("Entrada não permitida");
        }


        idade = 16;
        isMaiorDeIdade = idade >= 18;
        if(!isMaiorDeIdade) {
            System.out.println("Menor de idade");
        } else {
            System.out.println("Maior de idade");
        }

        // else if
        boolean a = false;
        boolean b = false;
        boolean c = false;

        if(a) {
            System.out.println("a");
        } else if(b) {
            System.out.println("b");
        } else if(c) {
            System.out.println("c");
        } else {
            System.out.println("nenhum");
        }

        // operador ternario =  condicao ? caso verdadeiro : caso falso
        System.out.println("OPERADOR TERNARIO:");

        double salario = 6000;
        System.out.println(salario > 5000 ? "Eu vou doar 500" : "Nao vou doar");
        System.out.println(salario > 6500 ? "Eu vou doar 500" : "Nao vou doar");

        //switch
        int diaDaSemana = 5;

        switch (diaDaSemana) {
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Segunda");
                break;
            case 3:
                System.out.println("Terça");
                break;
            case 4:
                System.out.println("Quarta");
                break;
            case 5:
                System.out.println("Quinta");
                break;
            case 6:
                System.out.println("Sexta");
                break;
            case 7:
                System.out.println("Sabado");
                break;
            default:
                System.out.println("inválido");
                break;
        }

        switch (diaDaSemana) {
            case 1:
            case 7:
                System.out.println("Final de semana");
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                System.out.println("Dia de semana");
                break;
            default:
                System.out.println("inválido");
                break;
        }
    }
}
