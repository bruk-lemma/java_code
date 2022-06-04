import java.text.NumberFormat;
import java.util.Scanner;

public class Modified_Mortgage_Calculator {

    public static void main(String[] args) {
        double p = general("principal", 100D, 1000_000D);
        double i = general("interest", 0D, 30D);
        double y = general("year", 0D, 30D);
        double r = (i / 100) / 12;
        double equation = (Math.pow((1 + r), (y * 12)));
        double mortgage = p * (r * equation / (equation - 1));
        show(p, y, r, mortgage);


    }

    private static void show(double p, double y, double r, double mortgage) {
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        String fullMortgage = currency.format(mortgage);
        System.out.println("MORTGAGE");
        System.out.println("---------");
        System.out.println("Monthly payment:" + fullMortgage);
        remaining_balance(p, y, r, currency);
    }

    private static void remaining_balance(double p, double y, double r, NumberFormat currency) {
        double payment_made = 1;
        System.out.println("Payment Schedule");
        System.out.println("-----------------");
        for (int x = 0; x <= (y * 12); x++) {
            double common = Math.pow((1 + r), (y * 12));
            double common2 = Math.pow((1 + r), payment_made);
            double B = p * (common - common2) / (common - 1);
            System.out.println(currency.format(B));
            payment_made = payment_made + 1;
            if (B <= 0) {
                System.out.println("Mortgage Fully paid no More debt");
                break;
            }
        }
    }

    public static double general(String label, Double minValue, Double maxValue) {
        Scanner scanner = new Scanner(System.in);
        double value;
        while (true) {
            System.out.println(label + ":");
            value = scanner.nextDouble();
            if (value > minValue && value <= maxValue) break;
            System.out.println("Enter a valid number between " + minValue + " and " + maxValue);
        }
        return value;
    }

}
