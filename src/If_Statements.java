import java.util.Scanner;

public class If_Statements {
    public static  void main(String[] args){
        //the following code demonstrates the basic use of if-else clause
        int temperature=32;
        if(temperature > 30){
            System.out.println("its a hot day today");
            System.out.println("you must stay hydrated!!");
        } else if (temperature < 10) {
            System.out.println("its pretty chill outside and there is ice....!!");
        }else {
            System.out.println("the weather today is unknown...!");
        }
        //the following code demonstrates the use of ternary an alternative to if else statments
        int income=120_000;
        String classType= (income > 100_000? "Business-class" : "Economy-class");
        System.out.println("class-type = " + classType);

        //the following code demonstrates how to use the switch statements another alternative to if-else statements in java
        Scanner scanner=new Scanner(System.in);
        System.out.print("what's is your role in the company!! ");
        String role=scanner.nextLine();
        switch(role){
            case "admin":
                System.out.println("your role is As An Admin...!");
                break;
            case "user":
                System.out.println("your role is as a User...!");
                break;
            default:
                System.out.println("Your are a guest....!");
        }

    }

}
