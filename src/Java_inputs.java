import java.util.Scanner;

public class Java_inputs {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
//        System.out.print("Age");
//        int age=(scanner.nextInt());
//        System.out.println("your Age is: " +age);
        System.out.println("Name:");
        String name=scanner.nextLine().trim();
        System.out.println("you are : " + name);
    }
}
