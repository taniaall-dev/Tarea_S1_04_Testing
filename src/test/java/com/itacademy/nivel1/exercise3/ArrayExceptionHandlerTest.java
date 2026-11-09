package com.itacademy.nivel1.exercise3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class ArrayExceptionHandlerTest {

    @Test
    public void shouldThrowArrayIndexOutOfBoundsExceptionWhenAccessingInvalidPosition () {
        ArrayExceptionHandler arrayExceptionHandler = new ArrayExceptionHandler();

        assertThrows(ArrayIndexOutOfBoundsException.class, () -> arrayExceptionHandler.accessInvalidArrayPosition(7));
    }
}
