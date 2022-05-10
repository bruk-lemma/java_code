import java.awt.*;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
         //the code below illustrates the primitive types
          byte age=30;
          long viewCount=3_123_456_85L;
          float price=10.99F;
          char letter='A';
          boolean isEligible=false;
          Date now=new Date();
          System.out.println("the is the date " + now );

          //this code below shows primitive type variables
          byte x=1;
          byte y=x;
          x=2;
          System.out.println(y);

          //this code shows reference type variables
          Point point1=new Point(1,1);
          Point point2=point1;
          point1.x=2;
          System.out.println(point1);

          // the code below mainly focuses on the fundamentals of string class
          String message = " The Mystery of Quantum Physics" + "!!"; //this is string literal mad easy by java but by nature it's a reference type
          System.out.println(message.indexOf('Q'));
          System.out.println(message.replace('t','b')); //this returns a new string because strings are immutable the methods that modify the strings return a new string
          System.out.println(message.trim());
          System.out.println(message.toLowerCase());
          System.out.println(message);

          //the code below illustrates the use of the escape sequence
          String decorateName="Leonel Messi The  \"king\" ";
          String fileAddress="c:\\Documents\\file1.pdf";
          String newline="Becoming super \n natural";
          System.out.println(decorateName);
          System.out.println(fileAddress);
          System.out.println(newline);

    }
}