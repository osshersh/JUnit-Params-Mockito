package task4;

public class Season {

    public static String getSeasonsName(Seasons seasons) {
        switch (seasons) {

            case AUTUMN -> {
                return "Jesien";
            }
            case WINTER -> {
                return "Zima";
            }
            case SPRING -> {
                return "Wiosna";
            }
            case SUMMER -> {
                return "Lato";
            }
        }
        return "Wrong value";
    }
}
