package task4;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EnumSource;

import java.util.EnumSet;

class SeasonTest {

    @ParameterizedTest
    @EnumSource(value = Seasons.class,
                names = {"AUTUMN","WINTER","SPRING","SUMMER"})

    void shouldReturnContainsSeasons(Seasons season) {
         Assertions.assertTrue(EnumSet.allOf(Seasons.class).contains(season));
    }

    @ParameterizedTest
    @EnumSource(value = Seasons.class,
            names = {"AUTUMN"})
    void shouldReturnSeasonName(Seasons season){
        Assertions.assertEquals("Jesien", Season.getSeasonsName(season));
    }

}