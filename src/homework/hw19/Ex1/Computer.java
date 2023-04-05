package homework.hw19.Ex1;

public class Computer {
    private String mark;
    private int price;
    private int ram;
    private int video;

    public Computer(String mark, int price, int ram, int video) {
        this.mark = mark;
        this.price = price;
        this.ram = ram;
        this.video = video;
        System.out.println("Создан PC.\nИмя = "+ "Марка \""+getMark()+"\";\n" +
                "Цена = "+getPrice()+" грн.;\n" +
                "Видеокарта = " + getVideo()+" Гб;\n" +
                "ОЗУ = " + ram +" Гб.");
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getVideo() {
        return video;
    }

    public void setVideo(int video) {
        this.video = video;


    }
}
