package com.openclassrooms.debugging.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Draggon Saddle Size Estimation based on an ancient ritual
 * This could also serve as a great example for a course on debugging
 * @Author Kal Issy
 */
@Service
public class DragonSaddleSizeEstimator {

    /**
     * A mystical constant
     */
    public static final double MYSTICAL_CONSTANT = 1;
    public static final int NON_EXISTANT_DRAGON_SIZE = 0;

    @Autowired
    private DragonSaddleSizeVerifier verifier;

    /**
     * Estimates the size of a saddle in centimeters for a given year
     * @param targetYear
     * @return Saddle size
     */
    public Double estimateSaddleSizeInCentiMeters(int targetYear) throws Exception {
        double saddleSizeInCm = calculateSaddleSizeFromYear(targetYear);

        // Verify that we have a valid saddle size
        verifier.verify(saddleSizeInCm);

        return saddleSizeInCm;
    }

    private double calculateSaddleSizeFromYear(int targetYear) {
        // Count down and how many years it's been alive
        double saddleSizeInCm = targetYear-MYSTICAL_CONSTANT;

        // This is from an era before dragon's were spawned
        if (saddleSizeInCm<0) {
            return NON_EXISTANT_DRAGON_SIZE;
        }

        // calculate the final saddle size
        return saddleSizeInCm;
    }
}
