package com.openclassrooms.debugging;

public class SaddleSizeReporter {

    /**
     * Produces a sentence reporting on the dragon saddle size
     * @param targetYear of estimate
     * @param beltSize estimated
     * @return sentence communicating the estimate
     */
    public String report(int targetYear, double beltSize) {
        return new StringBuilder("In the year ").
            append(targetYear).
            append(", dragons born in the year 1 AD will have a saddle size of ").
            append(beltSize).append(" meters").toString();
    }
}