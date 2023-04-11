package homework.hw21.Ex3;

public class LowZeroIntValue extends Exception {
    public String getMessage() {
        return "Вы ввели отрицательное число";
    }
}