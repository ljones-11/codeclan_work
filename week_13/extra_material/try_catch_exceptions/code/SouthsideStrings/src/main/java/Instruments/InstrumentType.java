package Instruments;

public enum InstrumentType {
    GUITAR("Guitar"),
    BASS("Bass"),
    DRUMS("Drums");

    private String name;

    InstrumentType(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
