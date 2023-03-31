package homework.hw18;

import java.util.Scanner;

public class Ex3 {

    public static void what(int number) {
        int mirrorNunber;
        if (number > (1 / 10)) {
            mirrorNunber = number % 10;
            number = number / 10;
            System.out.print(mirrorNunber + "" + mirrorNunber + " ");
            Ex3.what(number);
        }
    }

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Введите число:");
        int number = reader.nextInt();
        System.out.println("Ваше обработанное число выглядит:");
        Ex3.what(number);
    }
}

