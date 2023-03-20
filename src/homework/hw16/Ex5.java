package homework.hw16;

import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        System.out.println("Введите число: ");
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        int number1=number;
        int reverse = 0;
        while (number != 0) {
            int remainder = number % 10;
            reverse = reverse * 10 + remainder;
            number = number / 10;
        }
        if (number1==reverse){
        System.out.println("Число " + reverse +" ЕСТЬ полиндромом.");
    } else {System.out.println("Число " + number1 +" НЕ ЕСТЬ полиндромом.");}
}
}