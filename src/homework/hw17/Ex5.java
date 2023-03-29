package homework.hw17;

import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите длину катетов треугольника:");
        int count = input.nextInt();
        System.out.println("Заполненный треугольник:");
//        Полный треугольник:
        for (int i = count; i > 0; i--) {
            for (int a = 0; a < i; a++) {
                System.out.print("*");
            }
            System.out.println("");
        }
        System.out.println("Пустой треугольник:");
        //        Пустой треугольник:

        for (int i = count; i > 0; i--) {
            for (int a = 0; a < i; a++) {
                if (a == 0 || a == i - 1 || i == count) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
    }
}
