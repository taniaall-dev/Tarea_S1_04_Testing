package com.itacademy.nivel2.exercise1;

import com.itacademy.nivel2.exercice1.AssertJExamples;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatExceptionOfType;

public class AssertJExamplesTest {
    private final AssertJExamples assertJExamples = new AssertJExamples();

    @Test
    public void shouldVerifyIntegerObjectsEqualityAndInequality() {
        Integer[] numbers = assertJExamples.createIntegerValues();

        assertThat(numbers[0]).isEqualTo(numbers[1]);
        assertThat(numbers[2]).isNotEqualTo(numbers[3]);
    }

    @Test
    public void shouldVerifyObjectReferencesIdentityAndDifference() {
        String[] references = assertJExamples.createObjectReferences();

        assertThat(references[0]).isSameAs(references[1]);
        assertThat(references[2]).isNotSameAs(references[0]);
    }

    @Test
    public void shouldVerifyArraysContainExactlyTheSameElements() {
        Integer[][] twoArrays = assertJExamples.createArraysIdentic();

        assertThat(twoArrays[0]).containsExactly(twoArrays[1]);
    }

    @Test
    public void shouldVerifyObjectListContentsAndOccurrences() {
        List<Object> objects = assertJExamples.createObjectList();

        assertThat(objects).containsExactly("Anna", "Anna", 21, 65.5);
        assertThat(objects).containsOnlyOnce(21);
        assertThat(objects).containsExactlyInAnyOrder("Anna", "Anna", 21, 65.5);
        assertThat(objects).doesNotContain("Peter");
    }

    @Test
    public void shouldVerifyMapContainsKey() {
        HashMap<String, Integer> hashMap = assertJExamples.createProductPriceMap();

        assertThat(hashMap).containsKey("Mouse");
    }

    @Test
    public void shouldThrowArrayIndexOutOfBoundsExceptionWhenAccessingInvalidPosition() {
        assertThatExceptionOfType(ArrayIndexOutOfBoundsException.class)
                .isThrownBy(() -> assertJExamples.accessInvalidArrayPosition());
    }

    @Test
    public void shouldVerifyOptionalIsEmpty() {
        Optional<String> optional = assertJExamples.createEmptyOptional();

        assertThat(optional).isEmpty();
    }
}
