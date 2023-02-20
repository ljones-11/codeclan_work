package StockItems;

import Interfaces.ISell;

public abstract class StockItems implements ISell {
    private double tradePrice;
    private double retailPrice;
    public StockItems(double tradePrice, double retailPrice) {
        this.tradePrice = tradePrice;
        this.retailPrice = retailPrice;
    }
    public double getTradePrice() {
        return tradePrice;
    }

    public void setTradePrice(double tradePrice) {
        this.tradePrice = tradePrice;
    }

    public double getRetailPrice() {
        return retailPrice;
    }

    public void setRetailPrice(double retailPrice) {
        this.retailPrice = retailPrice;
    }

    public double calculateMarkup() {
        return getRetailPrice() - getTradePrice();
    }
}
