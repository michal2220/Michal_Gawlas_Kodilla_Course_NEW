package com.kodilla.good.patterns.challenges.Food2Door;

public class DeliveryProcessor {

    private SupplierService supplierService;
    private DeliveryService deliveryService;

    public DeliveryProcessor(SupplierService supplierService, DeliveryService deliveryService) {
        this.supplierService = supplierService;
        this.deliveryService = deliveryService;
    }

    public OrderDto process (OrderRequest orderRequest){

        boolean isOrdered = deliveryService.deliver(orderRequest.getUserFood(),orderRequest.getSupplierService());
        if(isOrdered){
            supplierService.process();
            return new OrderDto (orderRequest.getUserFood(), orderRequest.getSupplierService(),true);
        } else {
            return new OrderDto(orderRequest.getUserFood(), orderRequest.getSupplierService(), false);
        }
    }
}
