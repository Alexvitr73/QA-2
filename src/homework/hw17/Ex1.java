package homework.hw17;

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        String[] name = {"Петя", "Маша", "Алёна", "Федя", "Саша", "Антон", "Глеб"};
        int[] number = {10, 12, 14, 16, 18, 20};
        String[] where = {"школу", "магазин", "церковь", "тренажерный зал", "кино", "поликлинику"};
        Scanner input = new Scanner(System.in);
        System.out.println("Введите три числа через запятую:");
        String word = input.next();
        String strArr[] = word.split(",");
        int numArr[] = new int[3];
        for (int i = 0; i < numArr.length; i++) {
            numArr[i] = Integer.parseInt(strArr[i]);
        }

        System.out.println("\"" + (name[numArr[0]]) + " будет идти в " +
                (where[numArr[2]]) + " в " + number[numArr[1]] + ":00\"");
    }
}
