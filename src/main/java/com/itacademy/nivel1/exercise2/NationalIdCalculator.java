package com.itacademy.nivel1.exercise2;

import java.util.List;

public class NationalIdCalculator {

    private static final List<Character> LETTERS = List.of(
            'T', 'R', 'W', 'A', 'G', 'M', 'Y',
            'F', 'P', 'D', 'X', 'B', 'N', 'J',
            'Z', 'S', 'Q', 'V', 'H', 'L', 'C',
            'K', 'E'
    );

    public char nationalIdCalculator(int id) {

        int num = 23;
        int resto = 0;
        if(id < 0 || id > 99999999) {
            throw new IllegalArgumentException("Error: Id out of allowed range");
        } else {
            resto = id % num;
        }

        return LETTERS.get(resto);

    }

}
