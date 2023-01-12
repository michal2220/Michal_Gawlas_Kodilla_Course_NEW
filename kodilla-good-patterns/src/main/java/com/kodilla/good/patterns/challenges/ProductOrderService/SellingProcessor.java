package com.kodilla.good.patterns.challenges.ProductOrderService;

public class SellingProcessor {

    private InformationService informationService;
    private SellingService sellingService;
    private HistoryService historyService;

    public SellingProcessor(InformationService informationService, SellingService sellingService, HistoryService historyService) {
        this.informationService = informationService;
        this.sellingService = sellingService;
        this.historyService = historyService;
    }

    public SellingDto process (SellRequest sellRequest){
        boolean isSold = sellingService.sellProduct(sellRequest.getUser(), sellRequest.getItem());
        if (isSold){
            informationService.inform(sellRequest.getUser());
            historyService.createSoldItem(sellRequest.getUser(), sellRequest.getItem());
            return new SellingDto (sellRequest.getUser(), true);
        } else {
            return new SellingDto (sellRequest.getUser(), false);
        }
    }

}
