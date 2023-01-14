package com.kodilla.good.patterns.challenges.Food2Door;

public class ExtraFoodShop implements SupplierService {
    @Override
    public boolean process() {

        System.out.println("Delivering from ExtraFoodShop");
        return true;
    }
}
