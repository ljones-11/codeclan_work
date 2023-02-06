package org.example;

public class Printer {

    private int sheets;
    private int remainingSheets = sheets;
    private int tonerVolume;
    private int remainingToner = tonerVolume;

    public Printer(int sheets, int tonerVolume) {
        this.sheets = sheets;
        this.remainingSheets = sheets;
        this.tonerVolume = tonerVolume;
        this.remainingToner = tonerVolume;
    }

    public int getSheets() {
        return remainingSheets;
    }

    public int getToner() {
        return remainingToner;
    }




    public int print(int sheetNum, int copies) {
        int sheetsRequired = sheetNum * copies;
        if (remainingSheets > sheetsRequired) {
            remainingSheets -= sheetsRequired;
//            remainingToner -= sheetsRequired;

            return remainingSheets;
        } else {
            return remainingSheets;
        }
//
    }

//    class PrintResult {
//        int remainingSheets;
//        int remainingToner;
//
//        PrintResult print(int remainingSheets, int remainingToner) {
//            this.remainingSheets = remainingSheets;
//            this.remainingToner = remainingToner;
//        }
//
//        public PrintResult print(int sheetNum, int copies) {
//            int sheetsRequired = sheetNum * copies;
//            if (remainingSheets > sheetsRequired) {
//                remainingSheets -= sheetsRequired;
//                remainingToner -= sheetsRequired;
//
//                return new PrintResult(remainingSheets, remainingToner);
//            } else {
//                return new PrintResult(remainingSheets, remainingToner);
//            }
//        }
//    }

}
