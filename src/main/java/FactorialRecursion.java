public class FactorialRecursion {

    public int getFactorial(int number){
        if(number>1){
            return(number * getFactorial(number-1));
        }

        //base case
        return number;
    }


    public static void main(String[] args){
        FactorialRecursion obj = new FactorialRecursion();
        System.out.println(obj.getFactorial(5));
    }
}
