package com.kodilla.good.patterns.challenges.Food2Door;

public class Food2DoorMain {


    public static void main(String[] args) {

        OrderRequestReceiver orderRequestReceiver = new OrderRequestReceiver();
        OrderRequest orderRequest = orderRequestReceiver.retreive();

        DeliveryProcessor deliveryProcessor = new DeliveryProcessor(
                new ExtraFoodShop(),
                new DoorDashService());

        deliveryProcessor.process(orderRequest);


    }
}
