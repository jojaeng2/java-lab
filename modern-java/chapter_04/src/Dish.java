
public class Dish {
    private final int calories;
    private final String name;


    public Dish(int calories, String name) {
        this.calories = calories;
        this.name = name;
    }

    public int getCalories() {
        return calories;
    }

    public String getName() {
        return name;
    }
}
