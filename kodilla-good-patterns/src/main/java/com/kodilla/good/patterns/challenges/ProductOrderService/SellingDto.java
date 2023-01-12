package com.kodilla.good.patterns.challenges.ProductOrderService;

public class SellingDto {

    private User user;
    private boolean isSold;

    public SellingDto(User user, boolean isSold) {
        this.user = user;
        this.isSold = isSold;
    }

    public User getUser() {
        return user;
    }

    public boolean isSold() {
        return isSold;
    }
}
