package com.kodilla.good.patterns.challenges.ProductOrderService;

public class SellingRequestReceiver {

    public SellRequest retrieve(){
        User user1 = new User("Bobby", "Bobson", "BobbY");
        Item item1 = new Item("Shovel", 10);

        return new SellRequest(user1, item1);
    }

}
