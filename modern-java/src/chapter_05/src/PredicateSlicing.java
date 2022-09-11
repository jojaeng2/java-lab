import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class PredicateSlicing {
    public static void main(String[] args) {

        List<Dish> specialMenu = Arrays.asList(
                new Dish("seasonal fruit", true, 120, Dish.Type.OTHER),
                new Dish("prawns", false, 300, Dish.Type.FISH),
                new Dish("rice", true, 350, Dish.Type.OTHER),
                new Dish("chicken", false, 400, Dish.Type.MEAT),
                new Dish("french fries", true, 530, Dish.Type.OTHER));

        List<Dish> filteredMenu = specialMenu.stream()
                .filter(dish -> dish.getCalories() < 320)
                .collect(Collectors.toList());
        
        List<Dish> slicedMenu1 = specialMenu.stream()
                .takeWhile(dish -> dish.getCalories() < 320)
                .collect(Collectors.toList());

        List<Dish> sliceMenu2 = specialMenu.stream()
                .dropWhile(dish -> dish.getCalories() < 320)
                .collect(Collectors.toList());

        List<Dish> dishes = specialMenu.stream()
                .filter(dish -> dish.getCalories() > 300)
                .limit(3)
                .collect(Collectors.toList());

        List<Dish> dishes1 = specialMenu.stream()
                .filter(dish -> dish.getCalories() > 300)
                .skip(2)
                .collect(Collectors.toList());

        List<String> dishNames = specialMenu.stream()
                .map(Dish::getName)
                .collect(Collectors.toList());

        List<String> words = Arrays.asList("Modern", "Java", "In", "Action");
        List<Integer> wordLengths = words.stream()
                .map(String::length)
                .collect(Collectors.toList());

        List<Integer> dishNameLengths = specialMenu.stream()
                .map(Dish::getName)
                .map(String::length)
                .collect(Collectors.toList());

        boolean isHealthy1 = specialMenu.stream()
                .allMatch(dish -> dish.getCalories() < 1000);

        boolean isHealthy2 = specialMenu.stream()
                .noneMatch(dish -> dish.getCalories() >= 1000);

        Optional<Dish> dish = specialMenu.stream()
                .filter(Dish::isVegetarian)
                .findAny();


    }
}
