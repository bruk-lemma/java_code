public class Logical_Operators {
    public static void main(String[] args){
        //the following code demonstrates the use of the AND  OR operators in java
        float temperature=20.5F;
        boolean isWarm=temperature < 40 && temperature > 35;
        System.out.println(isWarm);

        //the code below is regarding or operator

        boolean hasHighIncome=false;
        boolean hasGoodCredit=true;
        boolean hasCriminalRecord=false;
        System.out.println(hasHighIncome || hasGoodCredit && !hasCriminalRecord);
}
}
