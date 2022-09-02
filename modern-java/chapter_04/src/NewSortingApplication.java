import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class NewSortingApplication {
    public static void main(String[] args) {

        long beforeTime = System.currentTimeMillis();




        List<Dish> menu = new ArrayList<>();
//        for(int i=0; i<10000; i++) {
//            Dish dish = new Dish(i*100, "Name" + i);
//            menu.add(dish);
//        }

        List<String> lowCaloricDishesName = menu.parallelStream()
                .filter(d -> d.getCalories() < 400)
                .sorted(Comparator.comparing(Dish::getCalories))
                .map(Dish::getName)
                .collect(Collectors.toList());



        long afterTime = System.currentTimeMillis();

        long secDiffTime = (afterTime - beforeTime);
        System.out.println("시간차이(m) : "+secDiffTime);
    }
}
