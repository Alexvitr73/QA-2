package classwork.lesson2;

public class Ex1 {
    public static void main(String[] args) {
        String str1 = "I am testing like a god";
        String str2 = "the best of the best";
        char ch = str1.charAt(6);
        System.out.println("\"Строка \"the best of the best\" содержит в себе \'e\' и это "
                + str2.contains("e")+".\n Символ \'e\' находится в строке номер один под номером "
                +str1.indexOf("e")+".");

    }


}
