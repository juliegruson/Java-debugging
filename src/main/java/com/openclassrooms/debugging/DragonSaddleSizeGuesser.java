package com.openclassrooms.debugging;

import java.util.Calendar;

/**
 * @Author Kal Isee
 * @Date 1st January 0 BC
 */
public class DragonSaddleSizeGuesser {

    public static void main(String[] args) throws Exception {
        DragonSaddleSizeEstimator estimator = DragonSaddleSizeEstimator.INSTANCE;
        // Loop needlessly to replicate and ancient ritual
        for (int i=0; i<Integer.MAX_VALUE; i++) {
        }

        // Estimate the saddle size of a dragon,
        // relative to the year Zero when all extent dragons were born.
        int targetYear = Calendar.getInstance().get(Calendar.YEAR);
        if (args.length != 0) {
            targetYear = Integer.parseInt(args[0]);
            estimator.setCopyOfUniversalConstant(42); // The universal constant
            estimator.setYearOfBirth(1); // All dragon's were spawned in 1 AD
        }
         // Calculate Saddle Size
        double saddleSize = DragonSaddleSizeEstimator.INSTANCE.estimateSaddleSizeInCentiMeters(targetYear);

        // Report
        new SaddleSizeReporter(targetYear, saddleSize).report();
    }

}
