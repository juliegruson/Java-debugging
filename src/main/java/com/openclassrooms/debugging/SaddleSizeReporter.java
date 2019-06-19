package com.openclassrooms.debugging;

public class SaddleSizeReporter {
    private int targetYear;
    private double beltSize;

    public SaddleSizeReporter(int targetYear, double beltSize) {
        this.targetYear = targetYear;
        this.beltSize = beltSize;
    }

    public void report() {
        System.out.println("In the year " +
                targetYear +
                ", dragons born in the year 1 AD will have a saddle size of " +
                beltSize / 100 + " meters" +
                "(" + beltSize + " centimeters)"
        );
    }
}