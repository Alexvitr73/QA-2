package homework.hw15;

public class Ex4b {
    public static void main(String[] args) {
        int x=5;
        int y=7;
        boolean c= x>y;
        String string1 = "Число {X} больше {Y}, и это {True/False}";
        String string2 = string1.replace("{X}","%1$d")
                .replace("{Y}","%2$d")
                .replace("{True/False}","%3$b");

        System.out.printf(string2,x,y,c);
    }
}
