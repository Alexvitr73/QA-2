package homework.hw14;

public class Ex1 {
    public static void main(String[] args) {
        int a = 7;
        int b = 9;
        System.out.println("Начальное значение переменных a=" +a+ " и b="+b);
        a=a+b;
        b=a-b;
        a=a-b;

        System.out.println("Значение переменных после перестановки a=" +a+ " и b="+b);
    }

}
