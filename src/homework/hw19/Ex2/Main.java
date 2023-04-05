package homework.hw19.Ex2;

public class Main {
    public static void main(String[] args) {
        Tree tree=new Tree("Елка",17);
        System.out.println("Тип дерева - " + tree.getType());
        System.out.println("Высота в м. - "+ tree.getHeight());
        System.out.println("количество веток - " +tree.getCoutOfsticks());
        System.out.println("Цвет листьев - " + tree.getColour()+"\n");

        Tree tree1=new Tree(18,22,"Темно-зеленый");
        System.out.println("Тип дерева - " + tree1.getType());
        System.out.println("Высота в м. - "+ tree1.getHeight());
        System.out.println("количество веток - " +tree1.getCoutOfsticks());
        System.out.println("Цвет листьев - " + tree1.getColour()+"\n");

        Tree tree2=new Tree ();
        System.out.println("Тип дерева - " + tree2.getType());
        System.out.println("Высота в м. - "+ tree2.getHeight());
        System.out.println("количество веток - " +tree2.getCoutOfsticks());
        System.out.println("Цвет листьев - " + tree2.getColour()+"\n");

        Tree tree3=new Tree ("Секвоя");
        System.out.println("Тип дерева - " + tree3.getType());
        System.out.println("Высота в м. - "+ tree3.getHeight());
        System.out.println("количество веток - " +tree3.getCoutOfsticks());
        System.out.println("Цвет листьев - " + tree3.getColour()+"\n");
    }
}
