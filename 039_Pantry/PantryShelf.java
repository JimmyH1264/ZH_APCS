public class PantryShelf {
    public static void main(String[] args) {
        FoodItem chicken = new FoodItem();
        //makes a object called chicken
        chicken.name("chicken", 3);
        //make the chicken name chickn, couldve done it in a better way
        System.out.println(chicken.getName());
        System.out.println(chicken.getAmount());
        //chicken's name and how many chicken there is
        FoodItem beef = new FoodItem();
        beef.name("beef",4);
        FoodItem pork = new FoodItem();
        pork.name("pork",5);
        pork.eat(6);
        //eat methods
        chicken.eat(1);
        beef.eat(5);
    }
}