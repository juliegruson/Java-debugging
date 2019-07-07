package com.openclassrooms.debugging;

import java.util.Calendar;

/**
 * Guesses the size of a dragon's saddle.
 * TODO: Wise-elder Raf's feedback form the year 0 AD needs to <i>eventually</i> be addressed.
 *
 * @Author Kal Isee
 * @Date 1st January 0 BC
 */
public class DragonSaddleSizeGuesser {

    public static void main(String[] args) throws Exception {

        DragonSaddleSizeEstimator estimator = new DragonSaddleSizeEstimator();
        SaddleSizeReporter saddleSizeReporter = new SaddleSizeReporter();

        // Estimate the saddle size of a dragon,
        // relative to the year "One" when all extent dragons were born.
        int targetYear = Calendar.getInstance().get(Calendar.YEAR);

        // Take the year from the command line arguments
        if (args.length != 0) {
            targetYear = Integer.parseInt(args[0]);
        }

        informUser("Calculating saddle size for a dragon in the year " + targetYear);

        // Calculate Saddle Size
        double saddleSize = estimator.estimateSaddleSizeInCentiMeters(targetYear);

        // Convert to Meters
        double saddleSizeInMeters = MetricConverter.INSTANCE.convertCmToMeters(saddleSize);

        // Report
        String report = saddleSizeReporter.report(targetYear, saddleSizeInMeters);
        informUser(report);
    }

    private static void informUser(String report) {
        System.out.println(report);
    }


}
