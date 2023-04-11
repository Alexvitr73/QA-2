package homework.hw21.Ex4;

import java.util.Scanner;

public class Person {
    String name;
    int many;
    int quantyProduct1;

    public int getQuantyProduct1() {
        return quantyProduct1;
    }

    public void setQuantyProduct1(int quantyProduct1) {
        this.quantyProduct1 = quantyProduct1;
    }

    public int getQuantyProduct2() {
        return quantyProduct2;
    }

    public void setQuantyProduct2(int quantyProduct2) {
        this.quantyProduct2 = quantyProduct2;
    }

    int quantyProduct2;


    public Person(String name, int many) {
        this.name = name;
        this.many = many;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMany() {
        return many;
    }

    public void setMany(int many) {
        this.many = many;
    }

    public void pokupka(Product product1, Product product2) throws NotDivisionThree, NotMany, NotBeerAndTabacco {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите количество первого товара :");
        int quantyProduct1 = in.nextInt();
        System.out.println("Введите количество второго товара :");
        int quantyProduct2 = in.nextInt();

        if ((product1.name.equalsIgnoreCase("beer") || (product1.name.equalsIgnoreCase("TABACCO")))
                || (product2.name.equalsIgnoreCase("beer") || (product2.name.equalsIgnoreCase("TABACCO")))) {
            throw new NotBeerAndTabacco();
        }

        if ((quantyProduct1 % 3) != 0 || (quantyProduct2 % 3) != 0) {
            throw new NotDivisionThree();
        }
        int costAll = ((product1.cost) * (quantyProduct1)) + (product2.cost * quantyProduct1);
//        System.out.println("Стоимость Вашей покупки : " + costAll + " грн.");

        if (costAll > many) {
            throw new NotMany();
        } else {
            System.out.println("Уважаемый " +getName()+ " стоимость Вашей покупки - "+ costAll+" грн.\n" +
                    "Вы приобрели " + product1.name+ " в количестве - "+ quantyProduct1 +" , и "+ product2.name+
                    " в количестве - "+quantyProduct2+" .\nСЛАВА УКРАЇНІ !!!");
        }
    }
}

