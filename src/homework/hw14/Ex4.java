package homework.hw14;

public class Ex4 {
    public static void main(String[] args) {
        int x=1;
        String string = "Testing, is my favourite job";
        String str1 = string.substring(0,7);
        System.out.println("Слово "+x++ + " = "+str1+". Длина этого слова = "+str1.length()+".");
        String str2 = string.substring(9,11);
        System.out.println("Слово "+x++ + " = "+str2+". Длина этого слова = "+str2.length()+".");
        String str3 = string.substring(12,14);
        System.out.println("Слово "+x++ + " = "+str3+". Длина этого слова = "+str3.length()+".");
        String str4 = string.substring(15,24);
        System.out.println("Слово "+x++ + " = "+str4+". Длина этого слова = "+str4.length()+".");
        String str5 = string.substring(25,28);
        System.out.println("Слово "+x++ + " = "+str5+". Длина этого слова = "+str5.length()+".");
        boolean biggest= str1.length() > str2.length()&&str1.length() >str3.length()&&str1.length()>str4.length()&&str1.length()>str5.length();
        System.out.println("Первое слово длиннее остальных - " + biggest+".");
    }
}
