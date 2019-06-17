package com.openclassrooms.debugging;

import java.util.Calendar;

public class DragonSaddleSizeEstimator {
    // Singleton instance of the Dragon Size Estimator
    public static final DragonSaddleSizeEstimator INSTANCE = new DragonSaddleSizeEstimator();

    // The year when dragons were first spawned on Earth
    public static final int DRAGON_SPAWN_YEAR = 1;

    // Default to calculating a Dragon Saddle Size estimate for the current year
    public static int TARGET_YEAR = Calendar.getInstance().get(Calendar.YEAR);

    // The current age of the dragon
    private int age;

    public DragonSaddleSizeEstimator() {
        age = TARGET_YEAR - DRAGON_SPAWN_YEAR;
    }

    public static void setTargetYear(int year){
        TARGET_YEAR = year;
    }

    public int beltSize(int currentYear) {
        // Start by setting the saddle size to the dragon's current age
        int beltSize = age;

        // Add as many years to the dragon's age as it's been alive
        for (int i = currentYear; i> DRAGON_SPAWN_YEAR; i--) {
            beltSize++;
        }

        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        return beltSize;
    }
}
