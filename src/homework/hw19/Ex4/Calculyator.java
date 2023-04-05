package homework.hw19.Ex4;

import java.util.Scanner;

public class Calculyator {
    void summ(double first, double second){
        double result = first + second;
        System.out.println("Ответ: "+result);
    }
    void minus(double first, double second){
        double result = first - second;
        System.out.println("Ответ: "+result);
    }
    void multiply(double first, double second){
        double result = first * second;
        System.out.println("Ответ: "+result);
    }
    void division(double first, double second){
        double result = first / second;
        System.out.println("Ответ: "+result);
    }
    public void start(){
        System.out.println("Калькулятор запущен");
        Scanner in = new Scanner(System.in);
        String action;
        do{
            System.out.println("Введите действие с числами в формате(a+b, a-b, a*b или a/b) :");
            action=in.next();
            if(action.equalsIgnoreCase("stop")){
                System.out.println("Калькулятор закрыт");
                break;
            }else if (action.contains("+")){
                double first = Double.parseDouble(action.split("\\+")[0]);
                double second = Double.parseDouble(action.split("\\+")[1]);
                summ(first,second);
            }else if (action.contains("-")){
                double first = Double.parseDouble(action.split("\\-")[0]);
                double second = Double.parseDouble(action.split("\\-")[1]);
                minus(first,second);
            }else if (action.contains("*")){
                double first = Double.parseDouble(action.split("\\*")[0]);
                double second = Double.parseDouble(action.split("\\*")[1]);
                multiply(first,second);
            }else if (action.contains("/")){
                double first = Double.parseDouble(action.split("\\/")[0]);
                double second = Double.parseDouble(action.split("\\/")[1]);
                division(first,second);
            }else {
                System.out.println("Введите корректное действие");
            }

        } while (!action.equalsIgnoreCase("stop"));
    }
}
