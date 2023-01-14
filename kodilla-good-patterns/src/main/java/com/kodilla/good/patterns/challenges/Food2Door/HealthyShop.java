package com.kodilla.good.patterns.challenges.Food2Door;

public class HealthyShop implements SupplierService {
    @Override
    public boolean process() {

        System.out.println("Delivering from HealthyShop");
        return true;

    }
}
