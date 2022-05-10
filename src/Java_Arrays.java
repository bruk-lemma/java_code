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

    }
}
