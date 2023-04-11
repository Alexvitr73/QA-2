package homework.hw21.Ex2;

import java.util.ArrayList;

public class Arrays {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        int i=2147483638;
        try {
            for(int j =0; j<= i; j++) {
               list.add(i++);
//            System.out.println(list.get(j));
        }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        System.out.println("Вывод массива на консоль :\n"+ list);
     }
}
