package com.itacademy.nivel1.exercise3;

public class ArrayExceptionHandler {

    private final String[] textString = {
            "Text1",
            "Text2",
            "Text3",
    };

    public void accessInvalidArrayPosition(int index) {

        String s = textString[index];
    }
}
