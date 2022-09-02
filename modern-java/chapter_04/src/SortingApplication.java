import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortingApplication {

    public static void main(String[] args) {
        List<Dish> menu = new ArrayList<>();
        for(int i=0; i<10; i++) {
            Dish dish = new Dish(i*100, "Name" + i);
            menu.add(dish);
        }
        List<Dish> lowCaloricDishes = new ArrayList<>();

        for (Dish dish : menu) {
            if(dish.getCalories() < 400) {
                lowCaloricDishes.add(dish);
            }
        }

        Collections.sort(lowCaloricDishes, new Comparator<Dish>() {
            @Override
            public int compare(Dish dish1, Dish dish2) {
                return Integer.compare(dish1.getCalories(), dish2.getCalories());
            }
        });

        List<String> lowCaloricDishesName = new ArrayList<>();

        for (Dish dish : lowCaloricDishes) {
            lowCaloricDishesName.add(dish.getName());
        }
    }
}
