
//the following code demonstrates the concept of encapsulation

public class Employee {
    public int baseSalary;
    public int hourlyRate;
   // public int extraHours;

    public int calculateWage(int extraHours){
        return baseSalary + (hourlyRate*extraHours);
    }
}
