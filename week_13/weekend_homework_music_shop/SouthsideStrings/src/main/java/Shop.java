import Instruments.Bass;
import Instruments.Guitar;
import Instruments.GuitarType;
import Instruments.InstrumentType;
import Interfaces.IPlay;
import Interfaces.ISell;

import java.util.ArrayList;
import java.util.stream.DoubleStream;

public class Shop {
    private ArrayList<ISell> stock;

    public Shop() {
        this.stock = new ArrayList<>();
    }

    public ArrayList<ISell> getStock() {
        return stock;
    }

    public void setStock(ArrayList<ISell> stock) {
        this.stock = stock;
    }

    public void addStock(ISell iSell) {
        stock.add(iSell);
    }

    public void removeStock(ISell iSell) {
        stock.remove(iSell);
    }

    public double getTotalProfit() {
//        using for Loop //
//        double totalProfit = 0;
//        for (ISell item : stock){
//            totalProfit += item.calculateMarkup();
//        }
//        return totalProfit;

//        using streams
        return stock.stream()
                .mapToDouble(ISell::calculateMarkup)
                .sum();

    }

    public String playInstrument(IPlay iPlay) {
        return iPlay.play();
    }
}

