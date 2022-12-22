package task4;

import java.time.Month;

public class Season {
    public static void main(String[] args) {
        System.out.println(getSeasonsName(Month.DECEMBER));
    }


    public static String getSeasonsName(Month month) {
        switch (month) {

            case DECEMBER:
            case JANUARY:
            case FEBRUARY:
                return Seasons.WINTER.name();
            case MARCH:
            case APRIL:
            case MAY:
                return Seasons.SPRING.name();
            case JUNE:
            case JULY:
            case AUGUST:
                return Seasons.SUMMER.name();
            case SEPTEMBER:
            case OCTOBER:
            case NOVEMBER:
                return Seasons.AUTUMN.name();
            default:
                return "Wrong value";
        }
    }
}