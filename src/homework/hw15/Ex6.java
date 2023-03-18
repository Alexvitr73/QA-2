package homework.hw15;

import java.util.Date;
import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {
        Date date=new Date();
        String string1="Уважаемый X, Вы выполняете задание номер Y, и делаете это в Z часов W минут в V";
        System.out.println("Введите ваше имя: ");
        Scanner input =new Scanner(System.in);
        String name = input.next();
        System.out.println("Введите номер домашнего задания: ");
        String hwNumber=input.next();
        String denNedeli = String.format("%1$tA",date);
        String denNedeli1= denNedeli.substring(0, 1).toUpperCase() + denNedeli.substring(1);
        String final1 = String.format("Уважаемый %1$s, Вы выполняете задание номер %2$s, и делаете это" +
                " в %3$tH часов %3$tM минут в "+ denNedeli1+".",name,hwNumber,date );
        System.out.println(final1);
    }
}
