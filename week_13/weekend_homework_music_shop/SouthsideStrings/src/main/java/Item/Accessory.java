package Item;

public class Accessory extends Item{

    private String category;

    public Accessory(double tradePrice, double retailPrice, String description, String category) {
        super(tradePrice, retailPrice, description);
        this.category = category;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}
