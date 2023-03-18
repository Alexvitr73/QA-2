package homework.hw15;

import java.util.Date;
import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        Scanner char1=new Scanner(System.in);
        System.out.println("Введите порядок в каком будет отображаться " +
                "текущее время (H - часы, M - минуты, S - секунды ;");
        System.out.println("Первое значение :");
        String first = char1.next();
        String h1 = "%1$t"+first;
        System.out.println("Второе значение :");
        String second = char1.next();
        String h2 = "%1$t"+second;
        System.out.println("Третье значение :");
        String third = char1.next();
        String h3 = "%1$t"+third;
        Date date = new Date();
        System.out.printf("Сейчас время равно %tT\n", date);
        System.out.printf("Выводим время в Вашем формате "+h1+":"+h2+":"+h3, date);
    }
}
