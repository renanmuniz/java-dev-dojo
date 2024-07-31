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

        //Onde parei:
//        https://www.youtube.com/watch?v=gU-qCpBC5jk&list=PL62G310vn6nFIsOCC0H-C2infYgwm8SWW&index=23

    }
}
