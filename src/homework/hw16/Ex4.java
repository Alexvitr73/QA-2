package homework.hw16;

import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите первое слово:");
        String string1 = input.next();
        System.out.println("Введите следующее слово:");
        String string2 = input.next();
        String string3 = null;
        while (!string1.equals("STOP") && !string2.equals("STOP")) {
            string3 = string1 + " " + string2;
            System.out.println("Введите следующее слово:");
            string2 = input.next();
            while (!string2.equals("STOP")) {
                string3 = string3 + " " + string2;
                System.out.println(string3);
                System.out.println("Введите следующее слово: ");
                string2 = input.next();
            }

            if (!string2.equals("STOP")) {
                string3 = string3 + string2;
                System.out.println(string3);
            } else {
                System.out.println(string3);

            /*if(!string2.equals("STOP")) {
           string3= string1.concat(string2);
                System.out.println(string3);
           string2=input.nextLine();}*/

        /*string1=input.nextLine();
        string4 =string3+string1;
        System.out.println(string4);*/


            }
        }
    }
}
