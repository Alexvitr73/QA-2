package homework.hw15;

import java.util.Date;
import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите год вашего рождения:");
        int yearsUser = input.nextInt();
        Date date = new Date();
        String yearNow = String.format("%1$tY", date);
        Integer yearsNow = Integer.parseInt(yearNow);
        System.out.println("Ваш возраст составляет - " + (yearsNow - yearsUser) + " лет.");

    }
}
