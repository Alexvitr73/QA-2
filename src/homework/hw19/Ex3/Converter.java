package homework.hw19.Ex3;

public class Converter {
    String name;

    public String getName() {
        return name;
    }

    public Converter(String name) {

        this.name = name;
    }
    public int convertToInt(int number){

        return number;
    }
    public int convertToInt(byte b){

        return b;
    }
    public int convertToInt(short s){

        return s;
    }
    public int convertToInt(long l){

        return (int) l;
    }
    public int convertToInt(float f){

        return (int) f;
    }
    public int convertToInt(double d){

        return (int) d;
    }
    public int convertToInt(char ch){

        int ch1 = Character.getNumericValue(ch);

        return ch1;
    }
    public int convertToInt(String s){

        return Integer.parseInt(s);
    }
    public String convertToInt(boolean b){
        System.out.println("Вы ввели boolean");
        return "";
    }
    public double convertToDouble(int number){

        return (double) number;
    }
    public double convertToDouble(byte b){

        return (double) b;
    }
    public double convertToDouble(short s){

        return (double) s;
    }
    public double convertToDouble(long l){

        return (double) l;
    }
    public double convertToDouble(float f){

        return f;
    }
    public double convertToDouble(double d){

        return d;
    }
    public double convertToDouble(char ch){

        double ch1 = Character.getNumericValue(ch);

        return ch1;
    }
    public double convertToDouble(String s){

        return (double) Integer.parseInt(s);
    }
    public String convertToDouble(boolean b){
        System.out.println("Вы ввели boolean");
        return "";}

    public String converToString (int number){

        return String.valueOf(number);
    }
    public String converToString (byte b){

        return String.valueOf(b);
    }
    public String converToString (short s){

        return String.valueOf(s);
    }
    public String converToString (long l){

        return String.valueOf(l);
    }
    public String converToString (float f){

        return String.valueOf(f);
    }
    public String converToString (double d){

        return String.valueOf(d);
    }
    public String converToString(char ch){

        return String.valueOf(ch);
    }
    public String converToString (String s){

        return s;
    }
    public String converToString (boolean b){
        System.out.println("Вы ввели boolean");
        return "";}
}
