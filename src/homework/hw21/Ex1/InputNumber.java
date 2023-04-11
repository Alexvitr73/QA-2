package homework.hw21.Ex1;

import java.util.Scanner;

public class InputNumber {

    public void inputNumber() {
        System.out.println("Введите число :");
        Scanner in = new Scanner(System.in);
        int inputNumber = in.nextInt();
        int randomInt = (int) (Math.random() * 21 - 10);
        try {
            if (randomInt == 0) {
                new ArithmeticException();
            }
            if (randomInt < 0) {
                throw new MinusDivision();
            }
        } catch (ArithmeticException | MinusDivision name) {
            System.out.println(name.getMessage());
        } finally {
            double rezult = (double) inputNumber / randomInt;
            System.out.print("Введенное число = "+inputNumber + ",\n" +"Случайное число = "+ randomInt
                    + ",\n" +"Результат = " + rezult);

        }
    }
}