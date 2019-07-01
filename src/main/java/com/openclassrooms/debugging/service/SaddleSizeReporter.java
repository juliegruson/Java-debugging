package com.openclassrooms.debugging.service;

import org.springframework.stereotype.Service;

@Service
public class SaddleSizeReporter {

    /**
     * Returns a stock response reporting the dragon's saddle size
     * @param targetYear The year for which an estimate was calculated
     * @param beltSize The estimate for the dragon's saddle size
     * @return answer to the question of "what is my dragon's saddle size?"
     */
    public String report(int targetYear, double beltSize) {
        double sizeInMeters = beltSize / 100;
        StringBuilder response = new StringBuilder("In the year ");
        response.append(targetYear);
        response.append(", dragons born in the year 1 AD will have a saddle size of ");
        response.append(sizeInMeters);
        response.append(" meters");
        response.append("(");
        response.append(beltSize);
        response.append(" centimeters)");

        return response.toString();
    }
}