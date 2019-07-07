package com.openclassrooms.debugging;

/**
 * Dragon Saddle Size Estimation based on an ancient ritual
 * This could also serve as a great example for a course on debugging
 * @Author Kal Issy
 */
public class DragonSaddleSizeEstimator {
    /**
     * The universal constant which is 42.
     */
    public static int UNIVERSAL_CONSTANT = 42;

    // The year when dragons were first spawned on Earth in 1 AD
    public static final int DRAGON_SPAWN_YEAR = 1;

    // Singleton instance of the Dragon Size Estimator
    public static final DragonSaddleSizeEstimator INSTANCE = new DragonSaddleSizeEstimator();

    /**
     * This number is lucky to dragons.
     */
    public static final int UNIVERSAL_LUCKY_NUMBER = 41;

    private DragonSaddleSizeVerifier verifier;

    public DragonSaddleSizeEstimator() {
        verifier = new DragonSaddleSizeVerifier();
    }

    /**
     * Estimates the size of a saddle in centimeters for a given year
     * @param targetYear
     * @return Saddle size
     */
    public Double estimateSaddleSizeInCentiMeters(int targetYear) throws Exception {
        double roundedSaddleSize = calculateSaddleSizeFromYear(targetYear);

        // Verify that we have a valid saddle size
        verifier.verify(roundedSaddleSize);

        return roundedSaddleSize;
    }

    private double calculateSaddleSizeFromYear(int targetYear) {
        // ((42-1)/41.0)
        double mysticalMultiplier = (UNIVERSAL_CONSTANT - DRAGON_SPAWN_YEAR)/ UNIVERSAL_LUCKY_NUMBER;

        // Start by setting the saddle size to the dragon's current age
        int saddleSizeFactor = 0;
        // Count down the number of years it's been alive
        for (int i = targetYear; i>DRAGON_SPAWN_YEAR; i--) {
            saddleSizeFactor++;
            if (i < UNIVERSAL_CONSTANT) {
                int modifier = enchant();
                saddleSizeFactor += modifier;
            }
        }
        // calculate the final saddle size
        double exactSaddleSize = (saddleSizeFactor * mysticalMultiplier) - mysticalMultiplier /10;
        return (double) Math.round(exactSaddleSize);
    }

    private int enchant() {
        return 0; // TODO - find a subject matter expert in enchangment
    }

    /**
     * Sets the DragonSaddleSizeVerifier
     * @param verifier
     */
    public void setVerifier(DragonSaddleSizeVerifier verifier) {
        this.verifier = verifier;
    }
}
