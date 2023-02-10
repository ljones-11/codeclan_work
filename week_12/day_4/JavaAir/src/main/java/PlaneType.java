public enum PlaneType {
    BOEING747(416, 412770, 41277),
    BOEING_AIRBUS_A380(500, 575000, 57500),
    MICROLIGHT(2,600, 60);

    private final int capacity;
    private final int totalWeight;

    private final int reservedBaggageWeight;

    PlaneType(int capacity, int totalWeight, int reservedBaggageWeight) {
        this.capacity = capacity;
        this.totalWeight = totalWeight;
        this.reservedBaggageWeight = reservedBaggageWeight;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getTotalWeight() {
        return totalWeight;
    }

    public int getReservedBaggageWeight() {
        return reservedBaggageWeight;
    }
}
