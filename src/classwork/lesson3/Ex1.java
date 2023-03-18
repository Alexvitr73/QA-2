package classwork.lesson3;

import java.sql.SQLOutput;

public class Ex1 {
    public static void main(String[] args) {
        String string = "Мое имя {name}. Мой возраст {age}. Но чувствую я себя на все {newAge}.";
        String string2 = string.replace("{name}", "%1$s").replace("{age}",
                "%2$d").replace("{newAge}", "%3$d");
        System.out.println(string2);
        System.out.printf(string2, "Сергей", 31, 100);
    }
}
