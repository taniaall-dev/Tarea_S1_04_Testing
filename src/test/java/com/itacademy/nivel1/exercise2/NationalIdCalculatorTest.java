package com.itacademy.nivel1.exercise2;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NationalIdCalculatorTest {

    @ParameterizedTest
    @CsvSource({
            "12345678, Z",
            "00000000, T",
            "00000001, R",
            "00000002, W",
            "00000003, A",
            "00000004, G",
            "00000005, M",
            "00000006, Y",
            "00000007, F",
            "00000008, P"
    })
    public void shouldCalculateCorrectLetter(int id, char expectedLetter) {

        NationalIdCalculator calculator = new NationalIdCalculator();

        char actualLetter = calculator.nationalIdCalculator(id);

        assertEquals(expectedLetter, actualLetter);
    }
}