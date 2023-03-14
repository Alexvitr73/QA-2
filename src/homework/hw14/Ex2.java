package homework.hw14;

public class Ex2 {
    public static void main(String[] args) {
        double chislitel = 7.0;
        double znamenatel =5.0;
        int tselaya = (int) (chislitel/znamenatel);
        int ostatok = (int) (chislitel%znamenatel);

        System.out.println("Целая часть равна - "+ tselaya);
        System.out.println("Остаток от деления равен - "+ostatok);
        System.out.println("Знаменатель равен - " + (int)znamenatel);

    }
}
