import java.util.Scanner;

public class FizzBuzGame {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter a number...!!");
        float number= scanner.nextFloat() ;
        if(number%5==0 && number%3==0)
            System.out.println("FizzBuzz...!");
        else if(number%5==0)
            System.out.println("Fuzz...!");
        else if(number%3==0)
            System.out.println("Buzz...!");

        else System.out.println(number);
    }
}
