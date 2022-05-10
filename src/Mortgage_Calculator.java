import java.text.NumberFormat;
import java.util.Scanner;

public class Mortgage_Calculator {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.print("Principal: ");
        double principal=scanner.nextDouble();
        System.out.print("Annual Interest rate: ");
        double interest=(scanner.nextDouble());
        double r= (interest/100)/12;
        System.out.print("Period(years): ");
        int years=scanner.nextInt();
        double equation=(Math.pow((1+r),(years*12)));
        double mortgage=principal*(r*equation/(equation-1));
        NumberFormat currency=NumberFormat.getCurrencyInstance();
        String fullMortgage=currency.format(mortgage);
        System.out.println("The Mortgage is :" +fullMortgage);
    }


}
