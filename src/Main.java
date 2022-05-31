import java.awt.*;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        //instead of TextBox we use var. java automatically knows the type of the
        //object from the new right side of the assignment operator.
          var textBox1=new TextBox();
          textBox1.setText("Box 1");
          System.out.println(textBox1.text);
          //the code below and above shows the use of objects in java.
          var textBox2=new TextBox();
          textBox2.setText("Box 2");
          System.out.println(textBox2.text);

          //the following implementation comes from the encapsulation part.
             var employee1=new Employee();
             employee1.baseSalary=5000;
             employee1.hourlyRate=20;
             System.out.println(employee1.calculateWage(20));

    }
}