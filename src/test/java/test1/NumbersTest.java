package test1;

import org.junit.jupiter.api.Assertions;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;


class NumbersTest {


    @ParameterizedTest
    @ValueSource(ints = {2, 4, 6, 8})
    void shouldReturnTrueWhenValueIsDivide2(int value) {
        Assertions.assertTrue(Numbers.IsNumberDivide2(value));
    }


    @ParameterizedTest
    @CsvSource(value = {"6, 123", "15, 555", "32, 8888"})
    void shouldReturnSumOfNumber(int sum, int num) {
        Assertions.assertEquals(sum, Numbers.calculateSumNumber(num));
    }
}