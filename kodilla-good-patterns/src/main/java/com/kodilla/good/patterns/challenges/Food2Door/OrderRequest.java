package com.kodilla.good.patterns.challenges.Food2Door;

public class OrderRequest {


    private UserFood userFood;
    private Food food;
    private SupplierService supplierService;

    public OrderRequest(UserFood userFood, Food food, SupplierService supplierService) {
        this.userFood = userFood;
        this.food = food;
        this.supplierService = supplierService;
    }

    public UserFood getUserFood() {
        return userFood;
    }

    public Food getFood() {
        return food;
    }

    public SupplierService getSupplierService() {
        return supplierService;
    }
}
