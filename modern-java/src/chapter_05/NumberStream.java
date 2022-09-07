package chapter_05;

import java.util.Arrays;
import java.util.List;

public class NumberStream {

    public static void main(String[] args) {
        List<Dish> menus = Arrays.asList(
                new Dish("seasonal fruit", true, 120, Dish.Type.OTHER),
                new Dish("prawns", false, 300, Dish.Type.FISH),
                new Dish("rice", true, 350, Dish.Type.OTHER),
                new Dish("chicken", false, 400, Dish.Type.MEAT),
                new Dish("french fries", true, 530, Dish.Type.OTHER)
        );

        int calories = menus.stream()
                .mapToInt(Dish::getCalories)
                .sum();
        System.out.println("calories = " + calories);


    }
}
