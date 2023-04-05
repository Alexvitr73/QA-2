package homework.hw19.Ex2;

public class Tree {
    String type;
    int height;
    int coutOfsticks;
    String colour;

    public Tree(String type, int height) {
        this.type = type;
        this.height = height;
        coutOfsticks=13;
        colour="Зеленый";
    }

    public Tree(int height, int coutOfsticks, String colour) {
        this.height = height;
        this.coutOfsticks = coutOfsticks;
        this.colour = colour;
        this.type="Пихта";
        }

    public Tree() {
        this.height=350;
        this.coutOfsticks=29;
        this.colour="Желтый";
    }
    public Tree (String type) {
        this();
        this.type=type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getCoutOfsticks() {
        return coutOfsticks;
    }

    public void setCoutOfsticks(int coutOfsticks) {
        this.coutOfsticks = coutOfsticks;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }
    }
