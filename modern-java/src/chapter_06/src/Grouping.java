package chapter_06.src;

import java.util.*;

import static java.util.stream.Collectors.*;

public class Grouping {

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

        Map<Dish.Type, List<Dish>> dishesByType =
                menu.stream().collect(groupingBy(Dish::getType));
        System.out.println("dishesByType = " + dishesByType);
        // result =  {FISH=[prawns, salmon], MEAT=[pork, beef, chicken], OTHER=[french fries, rice, season fruit, pizza]}

        Map<Dish.Type, List<Dish>> caloricDishesByType = menu.stream().filter(dish -> dish.getCalories() > 500)
                .collect(groupingBy(Dish::getType));
        System.out.println("caloricDishesByType = " + caloricDishesByType);
        // result = {OTHER=[french fries, pizza], MEAT=[pork, beef]}
        // 필터 후 grouping하기 때문에 없는 키가 발생함

        // 키가 없는 문제 해결
        Map<Dish.Type, List<Dish>> caloricDishesByType2 = menu.stream()
                .collect(groupingBy(Dish::getType, filtering(dish -> dish.getCalories() > 500, toList())));
        System.out.println("caloricDishesByType2 = " + caloricDishesByType2);

        // 다수준 그룹화
        Map<Dish.Type, Map<CaloricLevel, List<Dish>>> dishesByTypeCaloricLevel = menu.stream()
                .collect(groupingBy(Dish::getType,
                        groupingBy(dish -> {
                            if(dish.getCalories() <= 400)
                                return CaloricLevel.DIET;
                            else if(dish.getCalories() <= 700)
                                return CaloricLevel.NORMAL;
                            else return CaloricLevel.FAT;
                        })));

        System.out.println("dishesByTypeCaloricLevel = " + dishesByTypeCaloricLevel);
        //  {OTHER={DIET=[rice, season fruit], NORMAL=[french fries, pizza]}, FISH={DIET=[prawns], NORMAL=[salmon]}, MEAT={DIET=[chicken], FAT=[pork], NORMAL=[beef]}}


        Map<Dish.Type, Long> typesCount = menu.stream().collect(
                groupingBy(Dish::getType, counting()));
        System.out.println("typesCount = " + typesCount);
        // {MEAT=3, OTHER=4, FISH=2}

        Map<Dish.Type, Optional<Dish>> mostCaloricByType = menu.stream()
                .collect(groupingBy(Dish::getType, maxBy(Comparator.comparing(Dish::getCalories))))
    }
}
