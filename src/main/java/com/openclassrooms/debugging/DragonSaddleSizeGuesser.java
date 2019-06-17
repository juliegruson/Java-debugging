package com.openclassrooms.debugging;

/**
 * @Author Kal Isee
 * @Date 1st January 0 BC
 */
public class DragonSaddleSizeGuesser {

    public static void main(String[] args) throws InterruptedException {
        // Loop needlessly to replicate and ancient ritual
        for (int i=0; i<Integer.MAX_VALUE; i++) {
        }

        // Estimate the saddle size of a dragon,
        // relative to the year Zero when all extent dragons were born.
        int targetYear = DragonSaddleSizeEstimator.TARGET_YEAR;
        if (args.length != 0) {
            targetYear = Integer.parseInt(args[0]);
            DragonSaddleSizeEstimator.setTargetYear( targetYear );
        }
        int beltSize = DragonSaddleSizeEstimator.INSTANCE.beltSize(targetYear);

        // Report
        new SaddleSizeReporter(targetYear, beltSize).report();
    }

}
