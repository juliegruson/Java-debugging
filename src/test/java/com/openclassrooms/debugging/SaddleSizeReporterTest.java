package com.openclassrooms.debugging;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.startsWith;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

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
        int saddleSize = 4027;
        SaddleSizeReporter classUnderTest = new SaddleSizeReporter(targetYear, saddleSize);

        // Act
        classUnderTest.report();

        // Assert
        String actualReport = byteArrayOutputStream.toString();
        assertThat( actualReport,
                startsWith("Dragons born in the year 2019 have a waist size of 4027 cm"));
    }
}