package com.kodilla.good.patterns.challenges.ProductOrderService;

public class ShopService implements SellingService {


    public boolean sellProduct(User user, Item item)  {

        System.out.println("Item " + item.getItemName() + " sold to " + user);

        return true;
    }

}
