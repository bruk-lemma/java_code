import java.util.Arrays;

public class Java_Arrays {
    public static void main(String[] args){
        //the code below shows the basic structure of Arrays in Java
        //inJava Arrays are fixed size, so we cannot adda or remove items from thr Array
        //we can use the java collection class
        int [] numbers={1,5,8,3,4,9};
        System.out.println(Arrays.toString(numbers));
        System.out.println(numbers.length);
        System.out.println(numbers[2]);
        Arrays.sort(numbers);
        System.out.println("hello second class...");


        //the code below illustrates the creation and use of multidimensional Arrays

        int [][][] matrix=new int[2][3][5];
        matrix[0][1][1]=4;

        //the syntax below has the same function as the above in creating Arrays
        int[][] matrix2={{1,2,3},{5,6,8}};
        System.out.println(Arrays.deepToString(matrix));
        System.out.println(Arrays.deepToString(matrix2));

        //the code below shows the process of declaring and using constants in java.
        //in java constants are declared using the "final" modifier.
        final float PI=3.14F;
        System.out.println("The Value of circumference of a circle decided by its radius is " + PI);

        //the code below demonstrates the use of Arithmetic expression.
        int sum=5+8;
        int subtraction=8-5;
        double multiplication=8*5;
        double division=(double)8 / (double)5;
        System.out.println("the sum is " + sum + " the subtraction is " + subtraction + " the multiplication is " + multiplication + " the division is " + division);

        //the code below shows the use of addition and subtraction operators.
        int number1=5;
        int number2=number1++;        //post fix
        System.out.println(number1);
        System.out.println(number2);
        int number3=++number1;        //prefix
        System.out.println(number3);

        //the code below show casting in java
        //implicit and explicit casting occur in compatible variable types. like below
        //byte>short>int>long>float>double
        //implicit casting
        double d1=1.1;
        double d2= d1+2; //d1 has decimal value so d2 is treated as 2.0 using implicit casting it for computation.
        System.out.println(d2);

        double d3=1.1;
        int d4=(int)d3+2; //this is explicit casting where we change d3 to match our computation.
        System.out.println(d4);

        //the code below show the use of wrapper class's to parse variables.
        //parsing string in to double values
        String number="1.1";
        double parsed=Double.parseDouble(number) + 5;
        System.out.println(parsed);
        //parsing string in to integer
        String number_int="4";
        int parsed_int=Integer.parseInt(number_int)+5;
        System.out.println(parsed_int);

        //the following code demonstrates the use of the Math library in java
        double result=Math.round(1.1);
        System.out.println(result);
        double result2=Math.ceil(1.1);
        System.out.println(result2);
        double result3=Math.floor(1.1);
        System.out.println(result3);
        double result4=Math.max(1.2,1.4);
        System.out.println(result4);
        double result5=Math.random();
        System.out.println(result5);
        int result6=(int)Math.round(Math.random()*50);
        System.out.println(result6);






    }
}
