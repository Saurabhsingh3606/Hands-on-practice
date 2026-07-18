public class FinancialForecast {

    // Recursive function to calculate future value
    public static double forecast(double value, double rate, int years) {

        // Base case
        if (years == 0) {
            return value;
        }

        // Recursive case
        return forecast(value * (1 + rate), rate, years - 1);
    }

    public static void main(String[] args) {

        double initialValue = 1000;
        double growthRate = 0.10; // 10%
        int years = 5;

        double result = forecast(initialValue, growthRate, years);

        System.out.println("Future Value: " + result);
    }
}