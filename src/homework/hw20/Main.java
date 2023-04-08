package homework.hw20;

public class Main {
    public static void main(String[] args) {
        Shop shop = new Shop("Бавария");
        shop.returnCost(new Purchase("Водка", 115),
                new SalesMan("Петр", 22), new BuYer("Степан", "да"));
    }
}
