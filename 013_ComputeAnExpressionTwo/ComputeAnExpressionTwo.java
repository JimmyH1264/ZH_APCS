public class ComputeAnExpressionTwo
{
    public static void main(String[] args){
        ReturningCalculator calc = new ReturningCalculator();
        //this is the first part of the function
        //this is the second part btw double means fraction
        double theA = calc.doubleMultiplier(9.5,4.5);
        double theB = calc.doubleMultiplier(2.5,3.0);
        double theC = calc.doubleSubtractor(45.5,3.5);
        //this is the third part(bottom part)
        double theD = calc.divider((theA + theB),theC);
        //this is the final funciton
        System.out.println(theD);
    }
}