package homework.hw17;

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите однозначное целое число: ");
        int numberUser = input.nextInt();
        int[] array;
        int count;
        array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = ((int) (Math.random() * 10));
            System.out.println(" " + array[i]);
        }
        int i = 0;
        for (i = 0; i < array.length; i++) {

            count = array[i];

            if (count == numberUser) {
                System.out.println("\"Ваше число есть в массиве !!!\" ");
                break;
            }

            }
        if (i== array.length) {
            System.out.println("\"Вашего числа нет в массиве !!!\" ");
        }

    }
}



