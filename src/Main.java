import java.awt.*;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        //instead of TextBox we use var. java automatically knows the type of the
        //object from the new right side of the assignment operator.
        var textBox1 = new TextBox();
        textBox1.setText("Box 1");
        //  System.out.println(textBox1.text);
        //the code below and above shows the use of objects in java.
        var textBox2 = new TextBox();
        textBox2.setText("Box 2");
        // System.out.println(textBox2.text);

        //the following implementation comes from the encapsulation part.
        var employee1 = new Employee(50,5);
        new Employee(10000);
        // employee1.baseSalary=5000;
        //employee1.hourlyRate=20;

        //the code below shows thw usage of setters and getters in java.
        employee1.setBaseSalary(1);
        employee1.setHourlyRate(70);
        // System.out.println(employee1.getHourlyRate());
        System.out.println(employee1.getBaseSalary());
        System.out.println(employee1.calculateWage(20));
        //the println below prints the value of our overloaded methode of calculate ().
        System.out.println(employee1.calculateWage());

    }
}