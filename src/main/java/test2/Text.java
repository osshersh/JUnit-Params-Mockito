package test2;

public class Text {

    public static String convertToUpperCaseText(String text) {
        if (text == null || text.isEmpty()) {
            return text;
        }
        return text.toUpperCase();
    }
}
