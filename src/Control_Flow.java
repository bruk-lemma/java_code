import java.util.Scanner;

public class Control_Flow {
    public static void main(String[] args){
        //the following code illustrates the use of for loop in java.
        for(int i=0;i<5;i++){
            System.out.println("Hello From the for loop..." + (i+1));
        }

        //the following code works the same as for loop but using While loop.
        int j=0;
        while(j < 5 ){
            System.out.println("hello from the while loop..." + j);
            j++;
        }

         //while loops are important in cases where we don't know a head of time the number of iteration's we need to do.
         //on the other hand for loops are used to create iterations where we know for certain the number of iteration we need.
         //the following code demonstrates the use of while loop
        Scanner scanner=new Scanner(System.in);
        String word="";
        while(!word.equals("quit")){
            System.out.println("Enter A word..please");
            word=scanner.next();
            if(word.equals("pass"))
                continue; //the word continue is used to jump to the beginning of the loop.
            if(word.equals("quit"))
                break;    //the word break terminates the loop from execution.
            System.out.println(word);
        }

        //the following code implements  do while loops in java.
        //do while loops get executed at lest once no matter what the condition.
        //do while loops are not used as often as while loops, but they might be used in a certain unique cases.

        System.out.println("Enter A NUmber");
        float number=scanner.nextFloat();
        do{
            System.out.println("the number is odd...!" +(int)number);
        }while (number%2!=0);

        //the following code demonstrates the use of the for each loop.

    }
}
