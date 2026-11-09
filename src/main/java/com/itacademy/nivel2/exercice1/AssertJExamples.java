package com.itacademy.nivel2.exercice1;

import java.util.*;

public class AssertJExamples {

    public Integer[] createIntegerValues() {
        Integer[] numbers = {1, 1, 2, 3};

        return numbers;
    }

    public String[] createObjectReferences() {
        String first = new String("A");
        String second = first;
        String third = new String("C");

        String[] references = {
                first,
                second,
                third
        };

        return references;
    }

    public Integer[][] createIdenticalArrays() {
        Integer[] numbers1 = {1, 2, 3, 4};
        Integer[] numbers2 = {1, 2, 3, 4};

        Integer[][] twoArrays = {numbers1, numbers2};

        return twoArrays;
    }

    public List<Object> createObjectList() {

        List<Object> objects = new ArrayList<>();
        objects.add("Anna");
        objects.add("Anna");
        objects.add(21);
        objects.add(65.5);

        return objects;
    }

    public HashMap<String, Integer> createProductPriceMap() {

        HashMap<String, Integer> hashMap = new HashMap<>();
        hashMap.put("Mouse", 25);
        hashMap.put("Keyboard", 60);
        hashMap.put("Monitor", 150);

        return hashMap;
    }

    public void accessInvalidArrayPosition() {
        int[] numbers = {1, 2, 3};
        System.out.println(numbers[4]);
    }

    public Optional<String> createEmptyOptional() {
        return Optional.empty();
    }
}
