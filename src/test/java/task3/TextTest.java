package task3;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class TextTest {

    @ParameterizedTest
    @MethodSource("provideTextForCountTextLength")
    void shouldReturnProperTextLength(String input, int textLength) {
        assertEquals(Text.getTextLength(input), textLength);
    }

    private static Stream<Arguments> provideTextForCountTextLength() {
        return Stream.of(
                Arguments.of("test", 4),
                Arguments.of("hello", 5),
                Arguments.of("java  ", 6),
                Arguments.of("report", 6),
                Arguments.of(null, 0),
                Arguments.of("", 0)
        );
    }
}
