public class Methods_In_Java {

    public static void main(String[] args){
        //the code below show the usage of declared methods in java.
        greetUser("Brk");
        greetFullName("Leonel", "Messi");

    }
        //the code below shows the creation of methods in java.
    public static void greetUser(String name){
        System.out.println("hello " + name);
    }
        //the code below shows the declaration of methods with more than one parameter
    public static void greetFullName(String firstName, String lastName){
        System.out.println("Hello " + firstName + " " + lastName );
    }
}
