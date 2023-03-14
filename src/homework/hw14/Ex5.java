package homework.hw14;

public class Ex5 {
    public static void main(String[] args) {
        String string = "Completely random text in English. In it, we just need to determine how many times " +
                "the character 'a' occurs there. And we can use the split method and the length method.";
        String string2 = string.toLowerCase();
        int x = string2.split("a").length; // количество строк в массиве

        int y=x-1; // количество разделителей-маркеров массива в данном случае 'a', на один меньше

        System.out.println("Cимвол 'a' встречается в данной строке - "+y+ " раз.");

      }
}
