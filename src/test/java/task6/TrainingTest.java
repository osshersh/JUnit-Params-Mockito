package task6;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class TrainingTest {
    Training training = new Training();

    @ParameterizedTest
    @MethodSource("provideTextForCountTextLength")
    void shouldReturnAverageRatting(int minutes, double calories, int pulse, double average) {
        double value = training.getAverageRatting(minutes, calories, pulse);
        assertEquals(value, average);
    }

    @Test
    void shouldReturnIllegalArgumentException() {
        assertThrows(IllegalArgumentException.class, () -> {
            training.getAverageRatting(-33, 444, 33);
        });
    }

    private static Stream<Arguments> provideTextForCountTextLength() {
        return Stream.of(
                Arguments.of(20, 200, 180, 1.0),
                Arguments.of(30, 200, 180, 1.3),
                Arguments.of(30, 400, 160, 2.3),
                Arguments.of(61, 450, 140, 3)
        );
    }
}