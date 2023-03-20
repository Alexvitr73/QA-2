package homework.hw16;

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        System.out.println("Введите строку:");
        Scanner input = new Scanner(System.in);
        String word = input.nextLine();
        char[] bukvy = word.toCharArray();
        int i = 0;
        int j = 0;

        while (i < bukvy.length) {
            if (bukvy[i] == 'a') {
                j++;
            }
                i++;

            }
        System.out.println("Количество символов \"a\" в данной строке - "+j);
        }
    }



