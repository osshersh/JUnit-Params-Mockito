package task3;

public class Text {

    public static int getTextLength(String text) {
        if (text == null || text.isEmpty()) {
            return 0;
        }
        return text.length();
    }
}
