import java.text.NumberFormat;

public class Formatting_numbers {

    public static void main(String[] args){
        NumberFormat currency=NumberFormat.getCurrencyInstance();
        String result=currency.format(123456.89);
        System.out.println(result);
        NumberFormat percent=NumberFormat.getPercentInstance();
        String population_rate=NumberFormat.getPercentInstance().format(.8); //this is called methode chaining.
        System.out.println(population_rate);

    }
}
