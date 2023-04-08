package homework.hw20;

public class Shop {
    private String nameShop;

    public String getNameShop() {
        return nameShop;
    }

    public void setNameShop(String nameShop) {
        this.nameShop = nameShop;
    }

    public Shop(String nameShop) {
        this.nameShop = nameShop;
    }

    public void returnCost(Purchase purchase, SalesMan saleman, BuYer buyer) {
        int cost = purchase.getCostOfPurchase();

        if (saleman.chestnost()) {
            if (buyer.skidka().equalsIgnoreCase("Ваша скидка -10 %")) {
                System.out.println("Уважаемый " + buyer.getName() + ", продавец " + saleman.getName() + ", нашего магазина \"" + getNameShop() +
                        "\", продаст вам этот товар " + purchase.getNamePurchase() + ",\nэто алкогольная продукция, а ваш возраст " +
                        +saleman.getageOfClent() + ".\nСтоимость вашей покупки равна - " + purchase.getCostOfPurchase() + " грн.\nВаша скидка " + buyer.skidka() +
                        "\nСтоимость вашей покупки со скидкой - " + (purchase.getCostOfPurchase() * 0.9) + " грн.");
            } else {
                System.out.println("Уважаемый " + buyer.getName() + ", продавец " + saleman.getName() + ", нашего магазина \"" + getNameShop() +
                        "\", продаст вам этот товар " + purchase.getNamePurchase() + ",\nэто алкогольная продукция, а ваш возраст " +
                        +saleman.getageOfClent() + ".\nCкидки у Вас - нет.\nСтоимость вашей покупки - " + purchase.getCostOfPurchase() + " грн.");
            }
        } else {
            System.out.println("Уважаемый " + buyer.getName() + ", продавец " + saleman.getName() + ", нашего магазина \"" + getNameShop() +
                    "\",не продаст вам этот товар " + purchase.getNamePurchase() + ",\nэто алкогольная продукция, а ваш возраст " +
                    +saleman.getageOfClent() + ".\nМы честные продавцы !");
        }

    }
}
