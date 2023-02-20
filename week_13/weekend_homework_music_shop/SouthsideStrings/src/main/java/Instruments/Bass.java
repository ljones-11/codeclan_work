package Instruments;

import Interfaces.IPlay;

public class Bass extends Instrument implements IPlay {

    public Bass(InstrumentType instrumentType, String material, String colour, String model, double tradePrice, double retailPrice) {
        super(instrumentType, material, colour, model, tradePrice, retailPrice);
    }


    @Override
    public String play() {
        return "bumbabumbabumbabum";
    }

}
