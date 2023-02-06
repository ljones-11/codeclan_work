package org.example;

public class Bottle {
    private static final int volume = 100;
    private int remainingVolume = volume;

    public int getVolume(){
        return remainingVolume;
    }

    public int getRemainingVolume(){
        return remainingVolume;
    }

    public int drink() {
        return remainingVolume -= 10;
    }

    public int empty() {
        return remainingVolume = 0;
    }

    public int fill() {
        return remainingVolume = volume;
    }
}
