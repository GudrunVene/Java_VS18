import java.util.ArrayList;

public class Menu {

    private ArrayList<String> meals;

    public Menu(String firstFood) {

        this.meals = new ArrayList<String>();
        this.meals.add(firstFood);
    }

    // Implement the methods here
    public void addMeal(String meal){

        if (!this.meals.contains(meal)){
            this.meals.add(meal);
        } else {
            System.out.println("err");
        }
    }

    public void printMeals(){
        this.meals.size();
        int i = 0;

        if (this.meals.isEmpty()){
            System.out.println("empty");
        } else {
            while ( i < this.meals.size() ){
                this.meals.get(i);
                System.out.println(this.meals.get(i));
                i++;
            }
        }
    }

    public void clearMenu(){

        this.meals.clear();
    }

}
