
//the following code demonstrates the concept of encapsulation and Abstraction.

public class Employee {
    private int baseSalary;
    private int hourlyRate;
    // public int extraHours;
    //the following declaration implies the use of static(class) members in java.
    //so the following member is static member.
    public static int numberOfEmployees;

    //the following code demonstrates the use of static methods.
    //in order to use the instance members of the class we need an object inside the
    //static methode.
    public static void print_Number_of_Employees(){
        System.out.println(numberOfEmployees);
        new Employee(7000).setHourlyRate(5);
        new Employee(7000).getBaseSalary();
        new Employee(7000).setBaseSalary(7000);
        new Employee(7000).getBaseSalary(); System.out.println(new Employee(7000).calculateWage(4));
    }
    public Employee(int baseSalary,int hourlyRate){
        setBaseSalary(baseSalary);
        setHourlyRate(hourlyRate);
        numberOfEmployees+=2;
    }
    //the code below show the concept of constructor overloading.
    public Employee(int baseSalary){
       this(baseSalary,0);
        setBaseSalary(baseSalary);
    }
    public int calculateWage(int extraHours) {
        return baseSalary + (hourlyRate * extraHours);
    }
   //the code below shows methode overloading.
    public int calculateWage() {
        return calculateWage(0) ;
    }

    //the code below shows the getters and setters of the employee class
    //which is the main concept of encapsulation.
    public void setBaseSalary(int baseSalary) {
        if (baseSalary <= 0) {
            throw new IllegalArgumentException("Salary can not be less than zero..!");
        }
        this.baseSalary = baseSalary;
    }
    public int getBaseSalary() {
        return baseSalary;
    }

    public void setHourlyRate(int hourlyRate) {
        if (hourlyRate < 0) {
            throw new IllegalArgumentException("Hourly rate can not be less than zero...!");
        }
        this.hourlyRate = hourlyRate;
    }

    //when ever we make a methode private we are implementing abstraction
    //by reducing coupling in other dependent classes.
    private int getHourlyRate() {
        return hourlyRate;
    }

}
