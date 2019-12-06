public class SweetGarage {
    public static void main(String[] args) {
        Car aaaQQQ = new Car();
        aaaQQQ.year = 2019;
        aaaQQQ.engageTurbo();
        aaaQQQ.milesDriven = 11111124;
        aaaQQQ.manufacturerName = "Toyota";
        aaaQQQ.modelName = "XDH-123";
        //seperate way to modify the class, if i leave the () it will be the default one
        System.out.println("My car 1: aaaQQQ");
        System.out.println("year :" + aaaQQQ.year);
        System.out.println("Turbos :" + aaaQQQ.hasTurbo);
        System.out.println("Miles :" + aaaQQQ.milesDriven);
        System.out.println("Model Name  :" + aaaQQQ.modelName);
        System.out.println("Brand :" + aaaQQQ.manufacturerName  + "\n");
        Car hEllo = new Car(999,9923131,"Konda","DSA-1233",true);
        //this goes in order year,miles,brand,type,hasturbo or not
        System.out.println("My car 2: hEllo");
        System.out.println("year :" + hEllo.year);
        System.out.println("Turbos :" + hEllo.hasTurbo);
        System.out.println("Miles :" + hEllo.milesDriven);
        System.out.println("Model Name  :" + hEllo.modelName);
        System.out.println("Brand :" + hEllo.manufacturerName  + "\n");
        //print statements that shows the things of the car
        Car zOrz = new Car(1999,3131,"Tonda","NDA-999",true);
        System.out.println("My car 3: zOrz");
        System.out.println("year :" + zOrz.year);
        System.out.println("Turbos :" + zOrz.hasTurbo);
        System.out.println("Miles :" + zOrz.milesDriven);
        System.out.println("Model Name  :" + zOrz.modelName);
        System.out.println("Brand :" + zOrz.manufacturerName + "\n");
        Car jKaa = new Car(2099,9923131,"Zonda","NDE-1213",true);
        System.out.println("My car 4: jKaa");
        System.out.println("year :" + jKaa.year);
        System.out.println("Turbos :" + jKaa.hasTurbo);
        System.out.println("Miles :" + jKaa.milesDriven);
        System.out.println("Model Name  :" + jKaa.modelName);
        System.out.println("Brand :" + jKaa.manufacturerName + "\n");
        Car hoH = new Car(1909,9923131,"Londa","FDA-1013",false);
        System.out.println("My car 5: hoH");
        System.out.println("year :" + hoH.year);
        System.out.println("Turbos :" + hoH.hasTurbo);
        System.out.println("Miles :" + hoH.milesDriven);
        System.out.println("Model Name  :" + hoH.modelName);
        System.out.println("Brand :" + hoH.manufacturerName);

    }
}