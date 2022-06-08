public class CalculationHandler {
    public static void Calculate() {
        double p = Console.general("principal", 100D, 1000_000D);
        double i = Console.general("interest", 0D, 30D);
        double y = Console.general("year", 0D, 30D);
        double r = (i / 100) / 12;
        double equation = (Math.pow((1 + r), (y * 12)));
        double mortgage = p * (r * equation / (equation - 1));
        MortgageReport.show(p, y, r, mortgage);
    }
}
