package homework.hw15;

public class Ex4a {
    public static void main(String[] args) {
        String string1="\"Чтобы написать код нам нужны 1)Язык программирования 2)Среда разработки 3)Воодушевление\"";
        System.out.println("Исходная строка: \n" + string1);
        String string2 = String.format("Чтобы написать код нам нужны%1$s\n " +
                "\b1)Язык программирования\n \b2)Среда разработки\n \b3)Воодушевление",":");
        System.out.println("Вывод на экран:\n "+"\b"+string2);

    }
}
