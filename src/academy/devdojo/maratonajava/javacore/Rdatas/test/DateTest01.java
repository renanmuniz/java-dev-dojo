package academy.devdojo.maratonajava.javacore.Rdatas.test;

import java.util.Date;

public class DateTest01 {
    public static void main(String[] args) {
        Date date = new Date(0L); //long desde Wed Dec 31 21:00:00 BRT 1969
        System.out.println(date);
        date = new Date(1_728_400_000_000L);
        System.out.println(date); //Tue Oct 08 12:06:40 BRT 2024
    }
}
