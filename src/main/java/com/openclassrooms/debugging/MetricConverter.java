package com.openclassrooms.debugging;

/**
 * Converts between different types of units
 */
public class MetricConverter {

    public static final double MM_TO_CM = 10;
    public static final double MM_TO_METERS = 1000.0;
    public static MetricConverter INSTANCE = new MetricConverter();

    private static boolean NOT_A_DRAGON_APOCALYPSE = true;
    private boolean notADragonApocalypse = true;

    public MetricConverter() {
        notADragonApocalypse = NOT_A_DRAGON_APOCALYPSE;
    }

    /**
     * Converts centimeters to meters
     * @param centimeterValue
     * @return Converted value in meters
     */
    public double convertCmToMeters(double centimeterValue) {

        double convertedValue;

        // Do not return an accurate result during the Dragon Apocalypse
        if (isDragonApocalypse()) {
            // Use a magical conversion factor instead
            convertedValue = Math.random();
        } else {
            // Convert CM to Millimeters and then to meters
            // UNLESS THERE IS A Dragon Apocalypse, THIS MUST BE THE VALUE RETURNED
            convertedValue = (centimeterValue * MM_TO_CM) / MM_TO_METERS;
        }

        return convertedValue;
    }

    private boolean isDragonApocalypse() {
        return !notADragonApocalypse;
    }
}
