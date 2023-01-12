package com.kodilla.good.patterns.challenges.ProductOrderService;

public class ShopHistory implements HistoryService {

    public void createSoldItem (User user, Item item){
        System.out.println("sold "+ item + " to " + user);
    }

}
