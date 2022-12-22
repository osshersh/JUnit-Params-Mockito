package test2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.NullAndEmptySource;
import org.junit.jupiter.params.provider.ValueSource;

class TextTest {

    @ParameterizedTest
    @NullAndEmptySource
    void shouldProperWhenTextIsNull(String text) {
        Assertions.assertEquals(text, Text.convertToUpperCaseText(text));
    }

    @ParameterizedTest
    @ValueSource(strings = {"text"})
    void shouldReturnTrueWhenTextConvertToUpperCase(String text){
        Assertions.assertEquals("TEXT", Text.convertToUpperCaseText(text));
    }
}