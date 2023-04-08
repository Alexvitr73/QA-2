package homework.hw20;

public class Purchase {
    private String namePurchase;
    private int costOfPurchase;

    public Purchase(String водка, int costOfPurchase, SalesMan salesMan, BuYer buYer) {

    }

    public String getNamePurchase() {
        return namePurchase;
    }

    public void setNamePurchase(String namePurchase) {
        this.namePurchase = namePurchase;
    }

    public int getCostOfPurchase() {
        return costOfPurchase;
    }

    public void setCostOfPurchase(int costOfPurchase) {
        this.costOfPurchase = costOfPurchase;
    }

    public Purchase(String namePurchase, int costOfPurchase) {
        this.namePurchase = namePurchase;
        this.costOfPurchase = costOfPurchase;
    }
}
