public class Main {

    public static void main(String[] args) {

        Menu food = new Menu("Hamburger");

        food.addMeal("Fish'n'Chips");
        food.addMeal("Sauerkraut");

        food.printMeals();

    }
}
