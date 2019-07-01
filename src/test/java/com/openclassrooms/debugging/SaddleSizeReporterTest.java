package com.openclassrooms.debugging;

import com.openclassrooms.debugging.service.SaddleSizeReporter;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.hamcrest.CoreMatchers.startsWith;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

@DisplayName("Given that a dragon's saddle size has been estimated")
class SaddleSizeReporterTest {
    private SaddleSizeReporter classUnderTest = new SaddleSizeReporter();

    @DisplayName("When reported on it, then it should clearly communicate the size")
    @Test
    void report() {
        // Arrange
        int targetYear = 2019;
        int saddleSize = 2018;
        // Act
        String response = classUnderTest.report(targetYear, saddleSize);

        // Assert
        assertThat( response,
                startsWith("In the year 2019, dragons born in the year 1 AD " +
                        "will have a saddle size of 20.18 meters(2018.0 centimeters"));
    }
}