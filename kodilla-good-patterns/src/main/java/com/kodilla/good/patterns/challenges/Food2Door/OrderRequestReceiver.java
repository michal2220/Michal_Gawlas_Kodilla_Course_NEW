package com.kodilla.good.patterns.challenges.Food2Door;

public class OrderRequestReceiver {

    public OrderRequest retreive(){

        UserFood userFood = new UserFood("Bobby", "Bobson", "Booby");
        Food food = new Food("carrot");
        SupplierService supplierService = new ExtraFoodShop();

        return new OrderRequest(userFood, food, supplierService);
    }

}
