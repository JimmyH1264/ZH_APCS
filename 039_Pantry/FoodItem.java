public class FoodItem {
    private String foo1;
    private int fooNum1;
    public int amount;
    public void name(String foo1,int fooNum1){
        this.foo1 = foo1;
        this.fooNum1 = fooNum1;
    }
    public void eat(int amount){
        this.amount = amount;
        if (this.amount < fooNum1)
        { 
            fooNum1 -= this.amount;
            System.out.println("you want to eat some" + foo1 + ", you ate them and you have " + fooNum1 + " left.");
        }else{
            System.out.println("you dont have enough of it, you have " + fooNum1 + " chicken.");
        }


    }
    public String getName() {
        return foo1;
    }
    public int getAmount() {
        return fooNum1;
    }
    public static void main(String[] args) {
        FoodItem chicken = new FoodItem();
        chicken.name("Chicken",100);
        System.out.println(chicken.foo1);
        System.out.println(chicken.fooNum1);
        chicken.eat(2);
    }


}