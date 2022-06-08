import java.util.Scanner;

public class Console {
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
