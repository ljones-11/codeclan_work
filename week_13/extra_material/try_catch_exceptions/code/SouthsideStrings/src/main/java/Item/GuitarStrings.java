package Item;

public class GuitarStrings extends Item {
    private int stringGauge;

    public GuitarStrings(double tradePrice, double retailPrice, String description, int stringGauge) {
        super(tradePrice, retailPrice, description);
        this.stringGauge = stringGauge;
    }

    public int getStringGauge() {
        return stringGauge;
    }

    public void setStringGauge(int stringGauge) {
        this.stringGauge = stringGauge;
    }
}
