package com.kodilla.good.patterns.challenges.Food2Door;

public class OrderDto {

    private UserFood userFood;
    private SupplierService supplierService;
    private boolean isOrdered;

    public OrderDto(UserFood userFood, SupplierService supplierService, boolean isOrdered) {
        this.userFood = userFood;
        this.supplierService = supplierService;
        this.isOrdered = isOrdered;
    }

    public UserFood getUserFood() {
        return userFood;
    }

    public SupplierService getSupplierService() {
        return supplierService;
    }

    public boolean isOrdered() {
        return isOrdered;
    }
}
