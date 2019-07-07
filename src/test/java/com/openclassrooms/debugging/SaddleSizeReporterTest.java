package com.openclassrooms.debugging;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.hamcrest.CoreMatchers.startsWith;
import static org.hamcrest.MatcherAssert.assertThat;

@DisplayName("Given that a dragon's saddle size has been estimated")
class SaddleSizeReporterTest {
    private ByteArrayOutputStream byteArrayOutputStream;

    @BeforeEach
    public void setUp() {
        byteArrayOutputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(byteArrayOutputStream));
    }

    @DisplayName("When reported on it, then it should clearly communicate the size")
    @Test
    void report() {
        // Arrange
        int targetYear = 2019;
        int saddleSize = 2018;
        SaddleSizeReporter classUnderTest = new SaddleSizeReporter(targetYear, saddleSize);

        // Act
        classUnderTest.report();

        // Assert
        String actualReport = byteArrayOutputStream.toString();
        assertThat( actualReport,
                startsWith("In the year 2019, dragons born in the year 1 AD " +
                        "will have a saddle size of 20.18 meters(2018.0 centimeters"));
    }
}