package Item;

import StockItems.StockItems;

public abstract class Item extends StockItems {
    private String description;

    public Item(double tradePrice, double retailPrice, String description) {
        super(tradePrice, retailPrice);
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
