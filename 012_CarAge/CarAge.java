public class CarAge {
    public static void main(String[] args){
        ReturningCalculator calc = new ReturningCalculator();
        //this imports the calculator
        Car aaaQQQ = new Car(1031,3131414,"Vyda","daj-213",false);
        Car hEllo = new Car(1999,9923131,"Konda","DSA-1233",true);
        Car zOrz = new Car(1999,3131,"Tonda","NDA-999",true);
        Car jKaa = new Car(2000,9923131,"Zonda","NDE-1213",true);
        Car hoH = new Car(1909,9923131,"Londa","FDA-1013",false);
        //all from the import sweetgarage
        int currentY = 2019;
        //this means this year is 2019
        System.out.println("my first car is " + calc.integerSubtractor(currentY,aaaQQQ.year) +" years old.");
        System.out.println("my second car is " + calc.integerSubtractor(currentY,hEllo.year) +" years old.");
        System.out.println("my third car is " + calc.integerSubtractor(currentY,zOrz.year) +" years old.");
        System.out.println("my fourth car is " + calc.integerSubtractor(currentY,jKaa.year)+" years old.");
        System.out.println("my fifth car is " + calc.integerSubtractor(currentY,hoH.year)+" years old.");
        //calc.integerSubtractor means you subtract value, so i subtract 2019 to the year of the car, and that means how old the car is


    }
} 