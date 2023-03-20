package homework.hw16;

import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {
        System.out.println("Введите вместимость склада в кг.: ");
        Scanner input = new Scanner(System.in);
        int vesMetala = input.nextInt();
        while (vesMetala<5){
            System.out.println("Введите вместимость склада в кг.: ");
            int vesMetala2= input.nextInt();
            vesMetala=vesMetala2;
        }
while (vesMetala!=0){
    System.out.println("Введите сколько метала хотите здать (не менее 5 кг.):");
    int zdacha = input.nextInt();
    while (zdacha<5){
        System.out.println("Введите сколько метала хотите здать (не менее 5 кг.):");
        int zdacha2= input.nextInt();
        zdacha=zdacha2;}
    if ((vesMetala - zdacha) < 0) {
        System.out.println("Вес большой.\nЕще возможно здать кг. :"+(vesMetala-zdacha));
        continue;
    } else if ((vesMetala-zdacha)>=1&&(vesMetala-zdacha)<=4) {
        System.out.println("Остаток по складу кг. :"+(vesMetala-zdacha));
       break;

    }
    vesMetala=(vesMetala-zdacha);
    System.out.println("Еще возможно здать кг. :"+vesMetala);
}
    }
}
