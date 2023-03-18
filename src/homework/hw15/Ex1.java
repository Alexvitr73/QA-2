package homework.hw15;

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите текст c клавиатуры: \"Я тестирую замечательно. Что еще нужно?\" ");
        String sting1 = input.next();
        String string2 = input.next();
        String string3 = input.next();
        String string4 = input.nextLine();
        System.out.println("string1 = " + sting1);
        System.out.println("string2 = " + string2);
        System.out.println("string3 = " +string3 + "\b");
        System.out.println("string4 = "+string4.trim());

    }
}
