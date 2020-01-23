public class FoodItem {
    private String foo1;
    private int fooNum;
    public int amount;
    public void name(String foo1,int fooNum1){
        this.foo1 = foo1;
        this.fooNum = fooNum;
    }
    private void eat(int amount){
        this.amount = amount;
        if (this.amount < fooNum)
        { 
            fooNum -= this.amount;
        }else{
            System.out.println("you dont have enough of it, you have " + fooNum + " chicken.");
        }


    }
    public String getName() {
        return foo1;
    }
    public int getAmount() {
        return fooNum;
    }
    public static void main(String[] args) {
        FoodItem chicken = new FoodItem();
        chicken.name("Chicken",100);
        System.out.println(chicken.foo1);
        System.out.println(chicken.fooNum);
        chicken.eat(2);
    }


}