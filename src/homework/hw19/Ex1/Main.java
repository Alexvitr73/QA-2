package homework.hw19.Ex1;

public class Main {
    public static void main(String[] args) {
Computer computer = new Computer("Asus", 24000, 16,4);
       computer.setMark("Lenovo");
        computer.setPrice(28500);
        computer.setVideo(8);
        computer.setRam(32);
        System.out.println("\nСоздан новый PC.\nИмя = "+ "Марка \""+ computer.getMark()+"\";\n" +
                "Цена = "+ computer.getPrice()+" грн.;\n" +
                "Видеокарта = " + computer.getVideo()+" Гб;\n" +
                "ОЗУ = " + computer.getRam() +" Гб.");
    }
}
