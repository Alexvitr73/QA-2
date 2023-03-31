package homework.hw18;

public class Ex1 {
    static void summ1(int number1, int number2) {
        System.out.println("Сумма двух чисел равна: " + (number1 + number2));
    }

    static int summ2(int number1, int number2) {
        return (number1 + number2);
    }


    public static void main(String[] args) {
        System.out.println("Метод 1");
        summ1(48,52);
        System.out.println("Метод 2");
        System.out.println("Cумма двух чисел равна: "+Ex1.summ2(58,52));
        }
}