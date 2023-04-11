package homework.hw21.Ex4;

import homework.hw21.Ex3.BiggestValue;
import homework.hw21.Ex3.LowZeroIntValue;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws NotDivisionThree, NotMany, NotBeerAndTabacco {
        Person father = new Person("Василий", 1500);
        try {
            father.pokupka(Product.MILK, Product.POTATO);
            father.getQuantyProduct1();
            father.getQuantyProduct2();
        }
        catch (NotDivisionThree | NotMany |NotBeerAndTabacco e) {
            System.out.println(e.getMessage());
        }
    }
}