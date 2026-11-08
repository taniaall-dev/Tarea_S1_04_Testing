package com.itacademy.nivel1.exercise2;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class NationalIdCalculatorTest {

    @ParameterizedTest
    @CsvSource({
            "10000001, S",
            "10000002, Q",
            "10000003, V",
            "10000004, H",
            "10000005, L",
            "10000006, C",
            "10000007, K",
            "10000008, E",
            "10000009, T",
            "10000010, R"
    })
    public void shouldCalculateCorrectLetter(int id, char expectedLetter) {

        NationalIdCalculator calculator = new NationalIdCalculator();

        char actualLetter = calculator.nationalIdCalculator(id);

        assertEquals(expectedLetter, actualLetter);
    }

    @ParameterizedTest
    @ValueSource(ints = {-1, 100000000, 150000000})
    public void shouldThrowExceptionWhenIdIsOutOfRange(int id) {

        NationalIdCalculator calculator = new NationalIdCalculator();

        assertThrows(IllegalArgumentException.class,
                () -> calculator.nationalIdCalculator(id));
    }
}