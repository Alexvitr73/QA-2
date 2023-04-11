package homework.hw21.Ex4;

public enum Product {
    APPLE("APPLE", 28), POTATO("POTATIO", 6),
    MILK("MILK", 22), BEER("BEER", 44),
    TABACCO("TABACCO", 80);
    String name;
    int cost;
    int quantity;

    Product(String name, int cost) {
        this.name = name;
        this.cost = cost;
    }
}
