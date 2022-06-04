
//the following code demonstrates the concept of encapsulation and Abstraction.

public class Employee {
    private int baseSalary;
    private int hourlyRate;
    // public int extraHours;

    public Employee(int baseSalary,int hourlyRate){
        setBaseSalary(baseSalary);
        setHourlyRate(hourlyRate);
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
