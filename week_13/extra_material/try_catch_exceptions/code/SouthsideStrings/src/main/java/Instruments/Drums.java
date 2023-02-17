package Instruments;

import Interfaces.IPlay;

public class Drums extends Instrument implements IPlay {

    public Drums(InstrumentType instrumentType, String material, String colour, String model, double tradePrice, double retailPrice) {
        super(instrumentType, material, colour, model, tradePrice, retailPrice);
    }

    @Override
    public String play() {
        return "Bang, Bang, Crash";
    }


}
