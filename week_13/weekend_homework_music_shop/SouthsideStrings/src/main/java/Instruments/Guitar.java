package Instruments;

import Interfaces.IPlay;

public class Guitar extends Instrument implements IPlay {
    private int numberOfStrings;
    private GuitarType guitarType;


    public Guitar(InstrumentType instrumentType, GuitarType guitarType, String model, String material, String colour, int numberOfStrings, double retailPrice, double tradePrice) {
        super(instrumentType, material, colour, model, retailPrice, tradePrice);
        this.numberOfStrings = numberOfStrings;
        this.guitarType = guitarType;
    }

    @Override
    public String play() {
        if(guitarType == GuitarType.ACOUSTIC){
            return "Briiiiiiing Acoustic guitar noise";
        } else {
            return "Brrrrrr Electric guitar noise";
        }
    }

    public int getNumberOfStrings() {
        return this.numberOfStrings;
    }

    public GuitarType getGuitarType() {
        return this.guitarType;
    }
}
