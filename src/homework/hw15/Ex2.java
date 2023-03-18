package homework.hw15;

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        System.out.println("Введите первую сторону треугольника:");
        Scanner line1 = new Scanner(System.in);
        int a = line1.nextInt();
        System.out.println("Введите вторую сторону треугольника:");
        Scanner line2 = new Scanner(System.in);
        int b = line2.nextInt();
        System.out.println("Введите третью сторону треугольника:");
        Scanner line3 = new Scanner(System.in);
        int c = line3.nextInt();

        boolean zhach = ((a + b) > c) && ((a + c) > b) && ((b + c) > a);

        String answer =String.format("Треугольник по вашим значениям построить - " + zhach);
//        System.out.println(answer);
        String answer1 = answer.replace("true", ("возможно.").toUpperCase())
                .replace("false", ("не возможно.").toUpperCase());
        System.out.println(answer1);

    }
}
