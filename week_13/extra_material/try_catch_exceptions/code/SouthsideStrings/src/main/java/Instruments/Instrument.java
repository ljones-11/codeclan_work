package Instruments;

import Interfaces.IPlay;
import Interfaces.ISell;
import StockItems.StockItems;

public abstract class Instrument extends StockItems implements ISell {

    private String material;
    private String colour;

    private String model;

    private InstrumentType instrumentType;


    public Instrument( InstrumentType instrumentType, String material, String colour, String model, double tradePrice, double retailPrice) {
        super(tradePrice, retailPrice);
        this.material = material;
        this.colour = colour;
        this.model = model;
        this.instrumentType = instrumentType;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public InstrumentType getInstrumentType() {
        return instrumentType;
    }

    public void setInstrumentType(InstrumentType instrumentType) {
        this.instrumentType = instrumentType;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
