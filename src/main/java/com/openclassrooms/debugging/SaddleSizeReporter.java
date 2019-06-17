package com.openclassrooms.debugging;

public class SaddleSizeReporter {
    private int targetYear;
    private int beltSize;

    public SaddleSizeReporter(int targetYear, int beltSize) {
        this.targetYear = targetYear;
        this.beltSize = beltSize;
    }

    public void report() {
        System.out.println("Draggons born in the year " +
                targetYear +
                " have a waist size of " +
                beltSize + " cm");
    }
}