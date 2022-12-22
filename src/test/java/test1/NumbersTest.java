package test1;

import org.junit.jupiter.api.Assertions;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;


class NumbersTest {


    @ParameterizedTest
    @ValueSource(ints = {2, 4, 6, 8})
    void shouldReturnTrueWhenNumberIsEven(int value) {
        Assertions.assertTrue(Numbers.isEven(value));
    }

    @ParameterizedTest
    @ValueSource(ints = {1, 3, 7, 11})
    void shouldReturnTrueWhenNumberIsOdd(int value) {
        Assertions.assertFalse(Numbers.isEven(value));
    }

    @ParameterizedTest
    @CsvSource(value = {"6, 123", "15, 555", "32, 8888"})
    void shouldReturnSumOfNumber(int sum, int number) {
        Assertions.assertEquals(sum, Numbers.calculateSumNumber(number));
    }
}