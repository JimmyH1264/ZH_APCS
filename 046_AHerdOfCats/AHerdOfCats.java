public class AHerdOfCats {
    public void catstat(Cat[] x){
        for (int i = 0; i < x.length; i ++) {
            System.out.println(x[i].getName());
        }

    }
    public void catstat2(Cat[] x){
        for (Cat kit : x){
            System.out.println("Cat name :" + kit.getName());
            System.out.println("Cat weight in lbs :" + kit.getW());
            System.out.println("Cat breed : " + kit.getB());
        }

    }
    public static void main(String[] args) {
        Cat[] cats1 = {new Cat("Peter","persian",(30.5)),new Cat("Benisa","cool",(15.2)),new Cat("Bruce","bat",(200.3))};
        AHerdOfCats catarr = new AHerdOfCats();
        catarr.catstat2(cats1);
    }
}