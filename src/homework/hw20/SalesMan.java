package homework.hw20;

public class SalesMan extends Human implements PropertySalesMan {

    private String name;
    private int ageOfClent;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getageOfClent() {
        return ageOfClent;
    }

    public void setageOfClent(int ageOfClent) {
        this.ageOfClent = ageOfClent;
    }

    public SalesMan(String name, int ageOfClent) {
        this.name = name;
        this.ageOfClent = ageOfClent;
    }

    @Override
public void role(){
    System.out.println("Я продавец");

}
    @Override
    public boolean chestnost() {
        boolean answer;
        if (ageOfClent>=18){
            answer =true;}
            else {
            answer = false;
        }
        return answer;
        }
}
