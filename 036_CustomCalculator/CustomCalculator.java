public class CustomCalculator {

    public static void main(String[] args) {

        CustomCalculator calc = new CustomCalculator();
        System.out.println(calc.cusAdd(1,3));
        System.out.println(calc.cusSub(1,3));
        System.out.println(calc.cusMul(1,3));
        System.out.println(calc.cusDiv(1,3));
        System.out.println(calc.cusAdd(1,3));
        System.out.println(calc.cusPow(1,3));
        System.out.println(calc.cusSqRt(1));
        System.out.println(calc.cusTrM(1,3,5));
        System.out.println(calc.QuadraticFP(1,2,1));
        System.out.println(calc.QuadraticFN(1,3,5));
        // calc is the name of my object

    }
    public double cusAdd(double a,double b) {
        double c = a + b;
        return c;
    }
    public double cusSub(double a,double b) {
        double c = a - b;
        return c;
    }
    public double cusMul(double a,double b) {
        double c = a * b;
        return c;
    }
    public double cusDiv(double a,double b) {
        double c = a / b;
        return c;
    }
    public double cusPow(double a,double b) {
        double c = (double)(Math.pow(a,b));
        return c;
    }
    public double cusSqRt(double a) {
        double c = Math.sqrt(a);
        return c;
    }
    public double cusTrM(double a,double b,double c) {
        double d = a * b * c;
        return d;
    }
    public double QuadraticFP(double a,double b, double c) {
        double d = (0-b)+Math.sqrt((Math.pow(b,2)-(4*a*c)))/(2*a);
        return d;
    }
    public double QuadraticFN(double a,double b, double c) {
        double e = (0-b)-Math.sqrt((Math.pow(b,2)-(4*a*c)))/(2*a);
        return e;
    }
    //those are custom methods
}