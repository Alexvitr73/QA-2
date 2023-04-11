package homework.hw21.Ex3;

public class Main {
    public static void main(String[] args) throws BiggestValue, ArrayIndexOutOfBoundsException,LowZeroIntValue, ArithmeticException {
        ArrayInt arrayInt = new ArrayInt();
        try {
            arrayInt.arrayInt();
        }
        catch (ArrayIndexOutOfBoundsException|LowZeroIntValue|BiggestValue|ArithmeticException e){
            System.out.println(e.getMessage());
        }
    }
}