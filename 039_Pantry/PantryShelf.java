public class PantryShelf {
    public static void main(String[] args) {
        FoodItem chicken = new FoodItem();
        PantryShelf p = new PantryShelf();
        p.chicken.name("chicken", 3);
        System.out.println(p.chicken.foo1);
    }
}