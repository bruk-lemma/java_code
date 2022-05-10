public class If_Statements {
    public static  void main(String[] args){
        //the following code demonstrates the basic use of if-else clause
        int temperature=32;
        if(temperature > 30){
            System.out.println("its a hot day today");
            System.out.println("you must stay hydrated!!");
        } else if (temperature < 10) {
            System.out.println("its pretty chill outside and there is ice....!!");
        }else {
            System.out.println("the weather today is unknown...!");
        }
    }
}
