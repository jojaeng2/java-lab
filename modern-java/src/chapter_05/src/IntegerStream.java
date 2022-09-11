import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class IntegerStream {
    List<Integer> numbers = Arrays.asList(1, 2, 1, 3, 3, 2, 4);

    List<Dish> menu = Arrays.asList(
            new Dish("seasonal fruit", true, 120, Dish.Type.OTHER),
            new Dish("prawns", false, 300, Dish.Type.FISH),
            new Dish("rice", true, 350, Dish.Type.OTHER),
            new Dish("chicken", false, 400, Dish.Type.MEAT),
            new Dish("french fries", true, 530, Dish.Type.OTHER));
    int calories = menu.stream()
            .mapToInt(Dish::getCalories)
            .reduce(0, Integer::sum);

    IntStream intStream = menu.stream()
            .mapToInt(Dish::getCalories);

    Stream<Integer> stream = intStream.boxed();
}
