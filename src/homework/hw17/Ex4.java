package homework.hw17;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите длину массива (четное число):");
        int number = input.nextInt();
        while (number % 2 != 0) {
            System.out.println("Введите четное число - длину массива:");
            number = input.nextInt();
        }
        System.out.println("Исходный массив");
        int[] arrays = new int[number];
        for (int i = 0; i < arrays.length; i++) {
            arrays[i] = ((int) (Math.random() * 101));
            System.out.print(arrays[i] + " ");
        }
        System.out.println("\n");
        for (int i = 0; i < (arrays.length / 2); i++) {
            for (int a = i + 1; a < (arrays.length / 2); a++) {
                int temp;
                if (arrays[i] > arrays[a]) {
                    temp = arrays[i];
                    arrays[i] = arrays[a];
                    arrays[a] = temp;
                }
            }
        }
        for (int j = (arrays.length / 2); j < arrays.length; j++) {
            for (int b = j + 1; b < arrays.length; b++) {
                int temp1 = 0;
                if (arrays[j] < arrays[b]) {
                    temp1 = arrays[b];
                    arrays[b] = arrays[j];
                    arrays[j] = temp1;
                }
            }
        }
        System.out.println("Отсортированный массив");
        for (int i = 0; i < arrays.length; i++) {
            System.out.print(arrays[i] + " ");
        }
    }
}


