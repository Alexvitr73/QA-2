package homework.hw21.Ex3;

import java.util.Scanner;

public class ArrayInt {

    public void arrayInt() throws ArrayIndexOutOfBoundsException, LowZeroIntValue, BiggestValue {
        int randomLenght = (int) (Math.random() * 30 + 1);
        System.out.println("Длина массива - " + randomLenght);
        int[] array = new int[randomLenght];
        int intSearch;
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 31);
            System.out.print(array[i]+" ");
        }
        System.out.println("\nВведите индекс элемента массива:");
        Scanner in = new Scanner(System.in);
        int valueIndex = in.nextInt();
        if (valueIndex > randomLenght&&valueIndex<30) {
            throw new ArrayIndexOutOfBoundsException();
        }
        if (valueIndex >= 30) {
            throw new BiggestValue();
        }
        if (valueIndex < 0) {
            throw new LowZeroIntValue();
        }

        if (array[valueIndex] == 0) {
            throw new ArithmeticException();
        } else {
            intSearch = array[valueIndex];

            double divisionMunber = (double) intSearch / array[0];
            System.out.println("Ваше число = "+intSearch + ",\nРезультат деления его на первый элемент массива = " + divisionMunber);
        }
    }
}
