package classwork.lesson3;

import java.util.Date;
import java.util.Scanner;


public class Ex2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите предложение");
        String string1 = scan.nextLine();
        String[] strings = string1.split(" ");
        String word2=strings[1];
        String word3=strings[2];
        String string2=string1.replace(word2,"\nконечно\n").replace(word3,"\b"+word3);
        System.out.println(string2);
        Date date = new Date();
        String string21 = String.format("Напечатано сегодня в %1$tA, в %1$tH:%1$tM", date).toUpperCase();
        System.out.println(string21);



    }

}
