package academy.devdojo.maratonajava.introducao;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

public class Aula06EstruturasDeRepeticao {
    public static void main(String[] args) {

        //while
        int count = 0;
        while(count < 10) {
            System.out.println(count);
            count++;
        }

        //do-while
        int x = 0;
        do {
            System.out.println("x é: " + x);
        } while (x > 10);

        //for
        for(int a=0; a<10; a++) {
            System.out.println("for: " + a);
        }

        //enhanced for
        List<Integer> lista = new ArrayList<>();
        lista.add(1);
        lista.add(2);
        lista.add(3);
        lista.add(4);
        lista.add(5);

        for(Integer i : lista) {
            System.out.println("enhanced for: " + i);
        }

        //break e continue

        //break interrompe e sai do laço:
        int n = 0;
        while(n<10) {
            if(n==5) {
                break;
            }
            System.out.println("n = " + n);
            n++;
        } //0,1,2,3,4 e sai.

        //continue pula essa iteracao do laço e vai para a proxima
        int m=0;
        while(m<10) {
            if(m==5) {
                m++;
                continue;
            }
            System.out.println("m = " + m);
            m++;
        } //0,1,2,3,4,6,7,8,9 e sai.




    }
}
