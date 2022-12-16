package test1;

public class Numbers {

    public static int calculateSumNumber(int value) {
        int sum = 0;
        while (value != 0) {
            sum += value % 10;
            value /= 10;
        }
        return sum;
    }

    public static boolean IsNumberDivide2(int value) {
        return value % 2 == 0;
    }
}
