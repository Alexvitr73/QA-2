package homework.hw18;

public class Ex2 {
    static void razdelTwo(int[] array) {
        System.out.println("Список четных чисел:");
        for (int number : array) {
            if (number % 2 == 0) {
                System.out.println(number);
            }
        }
        System.out.println("Список нечетных чисел:");
        for (int number : array) {
            if (number % 2 != 0) {
                System.out.println(number);
            }
        }
    }

    public static void main(String[] args) {
        int[] array = {11, 42, 86, 123, 45, 22, 55, 66};
        Ex2.razdelTwo(array);
    }
}
