package homework.hw18;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Ex4 {
    public static void reversion() {

        System.out.println("Я пустой");
    }

    public static void reversion(String text) {

        System.out.println(text);
    }

    public static void reversion(String[] season)
    {
        for (int i = 0; i < season.length; i++) {
            System.out.print(season[i] + " ");
        }
    }
    public static void reversion(int[] reason) {
        int summ = 0;
        for (int i = 0; i < reason.length; i++) {

            summ = summ + reason[i];
        }
        System.out.println(summ);
    }
    public static void reversion(int number, String voice) {
        System.out.println("Ваше сообщение - "+ "\""+voice+"\", ваше число - " +number+" !!!");
        }

    public static void main(String[] args) {
        String[] season = new String[]{"Winter", "Spring", "Summer", "Autumn"};
        int[] reason = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};

        reversion(season);
    }
}

