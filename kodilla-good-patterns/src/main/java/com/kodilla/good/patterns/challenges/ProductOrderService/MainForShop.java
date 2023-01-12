package com.kodilla.good.patterns.challenges.ProductOrderService;

public class MainForShop {

    public static void main(String[] args) {

        SellingRequestReceiver sellingRequestReceiver = new SellingRequestReceiver();
        SellRequest sellRequest = sellingRequestReceiver.retrieve();

        SellingProcessor sellingProcessor = new SellingProcessor(
                new MailService(),
                new ShopService(),
                new ShopHistory());
        sellingProcessor.process(sellRequest);
    }

}
