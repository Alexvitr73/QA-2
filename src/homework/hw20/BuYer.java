package homework.hw20;

public class BuYer extends Human implements PropertyBuYer {

    private String name;
    private String skidka;

    private int ageOfclient;

    public BuYer(int ageOfclient) {
        this.ageOfclient = ageOfclient;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSkidka() {
        return skidka;
    }

    public void setSkidka(String skidka) {
        this.skidka = skidka;
    }

    public BuYer(String name, String skidka) {
        this.name = name;
        this.skidka = skidka;
    }

    @Override
    public void role() {
        System.out.println("Я покупатель");
    }

    public String skidka() {
        String youSkidka;
        if (skidka.equalsIgnoreCase("да")) {
            youSkidka = "Ваша скидка -10 %";
        } else {
            youSkidka = "Ваша скидка - 0 %";
        }
        return youSkidka;
    }
}
