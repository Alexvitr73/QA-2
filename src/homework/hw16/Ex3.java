package homework.hw16;

import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите порядковый номер дня недели:");
        int dayWeek = input.nextInt();
        if (dayWeek==1){
            System.out.println("Это число соответствует - Понедельник");}
            else if (dayWeek==2){
            System.out.println("Это число соответствует - Вторнику");}
        else if (dayWeek==3){
            System.out.println("Это число соответствует - Среда");}
        else if (dayWeek==4){
            System.out.println("Это число соответствует - Четверг");}
        else if (dayWeek==5){
            System.out.println("Это число соответствует - Пятница");}
        else if (dayWeek==6){
            System.out.println("Это число соответствует - Субота");}
        else if (dayWeek==7){
            System.out.println("Это число соответствует - Воскресенье");}
        else {
           System.out.println("Нет такого дня недели. Но лучше бы сегодня была пятница");}
        }
        }


