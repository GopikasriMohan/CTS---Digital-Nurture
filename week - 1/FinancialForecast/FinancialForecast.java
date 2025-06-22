public class FinancialForecast {

    // Recursive method to calculate future value
    public static double futureValue(double presentValue, double rate, int years) {
        // Base case: if no more years, return current value
        if (years == 0) {
            return presentValue;
        }
        // Recursive case: grow value one year and recurse
        return futureValue(presentValue * (1 + rate), rate, years - 1);
    }

    public static void main(String[] args) {
        double presentValue = 10000.0; // ₹10,000
        double rate = 0.08;            // 8% growth rate
        int years = 5;

        double result = futureValue(presentValue, rate, years);
        System.out.printf("Predicted future value after %d years: ₹%.2f%n", years, result);
    }
}
