package homework.hw14;

public class Ex3 {
    public static void main(String[] args) {
        String string1 = "This line that i want to cut, cause it is too long";
        System.out.println("\""+ string1+ "\"" + " \\Length = "+ string1.length()+"\\");
        int cause= string1.indexOf(" it is");
        String string2 = string1.substring(0,cause);
        System.out.println("\""+string2+"\""+ " \\Length = " + string2.length()+" \\");
        String string3 = string2.concat(" it is perfect");
        System.out.println("\""+string3+"\""+" \\Length = " + string3.length()+"\\" );

    }
}
