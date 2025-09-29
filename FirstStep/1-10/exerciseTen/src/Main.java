//10. Calculate a person's BMI.

import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        int weight = 60;
        double height = 1.52;
        double BMICalculator = weight / Math.pow(height, 2);

        System.out.printf("%.2f", BMICalculator);
    }
}