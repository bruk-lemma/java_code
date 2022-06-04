import java.text.NumberFormat;
import java.util.Scanner;

public class Mortgage_Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double principal;
        double interest;
        int years;

        while (true) {
            System.out.print("Principal: ");
            principal = scanner.nextDouble();
            if (principal >= 100 && principal <= 1000_000)
                break;
            System.out.println("Enter A A valid number between 1,000 and 1,000,000");
        }

        while (true) {
            System.out.print("Annual Interest rate: ");
            interest = (scanner.nextDouble());
            if (interest > 0 && interest <= 30)
                break;
            System.out.println("enter a Interest rate between 0 and 30");
        }

        double r = (interest / 100) / 12;
        while (true) {
            System.out.print("Period(years): ");
            years = scanner.nextInt();
            if (years > 0 && years <= 30)
                break;
            System.out.println("Please Enter a number greater than 0 and less than 30");
        }

        double equation = (Math.pow((1 + r), (years * 12)));
        double mortgage = principal * (r * equation / (equation - 1));
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        String fullMortgage = currency.format(mortgage);
        System.out.println("The Mortgage is :" + fullMortgage);
    }

    public static void general(String label, Double value, Double minValue, Double maxValue) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println(label + ":");
            value = scanner.nextDouble();
            if (value > minValue && value <= maxValue)
                break;
            System.out.println("Enter a valid number between " + minValue + " and " + maxValue);
        }
    }
}
