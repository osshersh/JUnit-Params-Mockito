package task6;

public class Training {

    public double getAverageRatting(int minutes, double calories, int pulse) {
        double average = (getTrainingLength(minutes) + getBurnedCalories(calories) + getAveragePulse(pulse)) / 3;
        getRating(average);
        return Math.round(average * 10.0) / 10.0;
    }

    private void getRating(double rating) {

        if (rating < 1.2) {
            System.out.println("niska");
        } else if (rating >= 1.2 && rating < 2) {
            System.out.println("dobra");
        } else if (rating >= 2 && rating < 3) {
            System.out.println("bardzo dobra");
        } else if (rating == 3) {
            System.out.println("doskonala");
        }
    }

    private int getTrainingLength(int minutes) {
        checkArgumentLessThanZero(minutes);

        if (minutes < 30) {
            return 1;
        } else if (minutes <= 60) {
            return 2;
        } else {
            return 3;
        }
    }

    private double getBurnedCalories(double calories) {
        checkArgumentLessThanZero(calories);

        if (calories <= 300) {
            return 1;
        } else if (calories > 300 && calories < 400) {
            return 2;
        } else {
            return 3;
        }
    }

    private int getAveragePulse(int averagePulse) {
        checkArgumentLessThanZero(averagePulse);

        if (averagePulse < 160) {
            return 3;
        } else if (averagePulse <= 175) {
            return 2;
        } else {
            return 1;
        }
    }

    private void checkArgumentLessThanZero(double value) {
        if (value < 0) {
            throw new IllegalArgumentException("argument cannot be less than zero");
        }
    }
}
