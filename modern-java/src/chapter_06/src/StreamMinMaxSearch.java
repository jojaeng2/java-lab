package chapter_06.src;

import java.util.*;

import static java.util.stream.Collectors.*;

public class StreamMinMaxSearch {
    public static void main(String[] args) {
        List<Dish> menu = Arrays.asList(
                new Dish("pork", false, 800, Dish.Type.MEAT),
                new Dish("beef", false, 700, Dish.Type.MEAT),
                new Dish("chicken", false, 400, Dish.Type.MEAT),
                new Dish("french fries", true, 530, Dish.Type.OTHER),
                new Dish("rice", true, 350, Dish.Type.OTHER),
                new Dish("season fruit", true, 120, Dish.Type.OTHER),
                new Dish("pizza", true, 550, Dish.Type.OTHER),
                new Dish("prawns", false, 300, Dish.Type.FISH),
                new Dish("salmon", false, 450, Dish.Type.FISH)
        );

        Comparator<Dish> dishCaloriesComparator = Comparator.comparingInt(Dish::getCalories);

        Optional<Dish> mostCalorieDish = menu.stream()
                .collect(maxBy(dishCaloriesComparator));

        int totalCalories = menu.stream().collect(summingInt(Dish::getCalories));

        int totalCalories2 = menu.stream().collect(reducing(0, Dish::getCalories, (i, j) -> i+j));

        int totalCalories3 = menu.stream().collect(reducing(0, Dish::getCalories, Integer::sum));


        double avgCalories = menu.stream().collect(averagingInt(Dish::getCalories));

        // IntSummaryStatistics == 하나의 연산으로 합계, 수, 평균, 최댓값 등등 구할 수 있음
        IntSummaryStatistics menuStatistics = menu.stream().collect(summarizingInt(Dish::getCalories));

        System.out.println("menuStatistics = " + menuStatistics);
        // menuStatistics = IntSummaryStatistics{count=9, sum=4200, min=120, average=466.666667, max=800}


    }
}
