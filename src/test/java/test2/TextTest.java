package test2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.NullAndEmptySource;
import org.junit.jupiter.params.provider.ValueSource;

class TextTest {

    @ParameterizedTest
    @NullAndEmptySource
    @ValueSource(strings = {"TEXT", "TEST", "HELLO"})
    void shouldReturnToUpperCaseText(String text) {
        Assertions.assertEquals(text, Text.returnToUpperCaseText(text));
    }
}