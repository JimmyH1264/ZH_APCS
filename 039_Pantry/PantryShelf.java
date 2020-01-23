public class PantryShelf {
    public static void main(String[] args) {
        FoodItem chicken = new FoodItem();
        chicken.name("chicken", 3);
        System.out.println(chicken.getName());
        System.out.println(chicken.getAmount());
        FoodItem beef = new FoodItem();
        beef.name("beef",4);
        FoodItem pork = new FoodItem();
        pork.name("pork",5);
        pork.eat(6);
        chicken.eat(1);
        beef.eat(5);
    }
}