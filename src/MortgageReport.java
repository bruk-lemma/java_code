import java.text.NumberFormat;

public class MortgageReport {
    public static void show(double p, double y, double r, double mortgage) {
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        String fullMortgage = currency.format(mortgage);
        System.out.println("MORTGAGE");
        System.out.println("---------");
        System.out.println("Monthly payment:" + fullMortgage);
        remaining_balance(p, y, r, currency);
    }

    public static void remaining_balance(double p, double y, double r, NumberFormat currency) {
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
}
