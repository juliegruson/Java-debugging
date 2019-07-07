package com.openclassrooms.debugging;

import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

class MetricConverterTest {

    // Arrange
    MetricConverter classUnderTest = new MetricConverter();

    @Test
    void convertCmToMeters_shouldReturnAMeterValue_whenConvertingAPositiveCentimeterValue() {
        double expectedMeterValue = 2.0;
        // Act
        double actualMeterValue = classUnderTest.convertCmToMeters(200.0);
        // Assert
        assertThat(actualMeterValue, is(equalTo(expectedMeterValue)));
    }

    @Test
    void convertCmToMeters_shouldReturnZeroMeters_whenConvertingZeroCentimeters() {
        double expectedMeterValue = 0;
        // Act
        double actualMeterValue = classUnderTest.convertCmToMeters(0);
        // Assert
        assertThat(actualMeterValue, is(equalTo(expectedMeterValue)));
    }

}