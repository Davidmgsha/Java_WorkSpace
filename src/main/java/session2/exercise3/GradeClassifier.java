package Session2.Exercise3;
public class GradeClassifier {
    public static String classify(int score) {

        if (score >= 90) {
            return "A";
        } else if (score >= 75) {
            return "B";
        } else if (score >= 60) {
            return "C";
        } else if (score >= 50) {
            return "D";
        } else {
            return "F";
        }
    }
    public static String classify(double percentage) {

        if (percentage >= 90.0) {
            return "A";
        } else if (percentage >= 75.0) {
            return "B";
        } else if (percentage >= 60.0) {
            return "C";
        } else if (percentage >= 50.0) {
            return "D";
        } else {
            return "F";
        }
    }

    public static void main(String[] args) {
        int[] scores = {95, 84, 70, 55, 40};

        System.out.println("Integer Scores:");
        for (int score : scores) {
            System.out.println("Score: " + score +
                    " -> Grade: " + classify(score));
        }

        System.out.println();
        double[] percentages = {92.5, 78.8, 65.4, 52.0, 47.9};

        System.out.println("Decimal Percentages:");
        for (double percentage : percentages) {
            System.out.println("Percentage: " + percentage +
                    " -> Grade: " + classify(percentage));
        }
    }
}