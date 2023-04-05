package homework.hw19.Ex3;

public class Main {
    public static void main(String[] args) {
        Converter convert = new Converter("Converter");

        System.out.println(convert.convertToInt('1'));
        System.out.println(convert.convertToInt(true));

        System.out.println(convert.convertToDouble(22));
        System.out.println(convert.convertToDouble(false));

        System.out.println(convert.converToString (33));
        System.out.println(convert.converToString(true));


    }
    }

