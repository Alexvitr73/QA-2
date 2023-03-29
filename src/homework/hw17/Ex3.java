package homework.hw17;

import java.util.Arrays;

public class Ex3 {
    public static void main(String[] args) {
        int[] array;
        array = new int[45];
        int i = 0;
        for (i = 0; i < array.length; i++) {
            array[i] = ((int) (Math.random() * (100 + 1)) - 50);
           }
        System.out.println((Arrays.toString(array)));

        int min = array[0] + 1;
        for (i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        System.out.println("Минимальное значение - " + min);

        int max = array[0] - 1;
        for (i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        System.out.println("Максимальное значение - " + max);
    }
}
