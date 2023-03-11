package HomeWork.HW13;

public class Ex1 {
    public static void main(String[] args) {
        int first = 5;
        int second = first*5;
        int third = second - first;
        first= first * third;

        System.out.println(first+", "+second+", "+third);
        System.out.println(first+second);
        System.out.println(third%first);
    }
}
