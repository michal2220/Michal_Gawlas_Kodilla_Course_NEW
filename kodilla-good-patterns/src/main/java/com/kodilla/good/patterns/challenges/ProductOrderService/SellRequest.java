package com.kodilla.good.patterns.challenges.ProductOrderService;

public class SellRequest {

    private User user;
    private Item item;

    public SellRequest(User user, Item item) {
        this.user = user;
        this.item = item;
    }

    public User getUser() {
        return user;
    }

    public Item getItem() {
        return item;
    }
}
