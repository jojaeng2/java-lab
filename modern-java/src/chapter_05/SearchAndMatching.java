package chapter_05;

import java.util.Arrays;
import java.util.List;

public class SearchAndMatching {
    public static void main(String[] args) {
        List<Dish> menus = Arrays.asList(
                new Dish("seasonal fruit", true, 120, Dish.Type.OTHER),
                new Dish("prawns", false, 300, Dish.Type.FISH),
                new Dish("rice", true, 350, Dish.Type.OTHER),
                new Dish("chicken", false, 400, Dish.Type.MEAT),
                new Dish("french fries", true, 530, Dish.Type.OTHER)
        );


        // 프레디케이트가 적어도 한 요소와 일치하는지 확인
        if(menus.stream().anyMatch(Dish::isVegetarian)) {
            System.out.println("The menu is (somewhat) vegetarian friendly!!");
        }

        // 프레디케이트가 모든 요소와 일치하는지 확인
        boolean isHealthy = menus.stream().allMatch(dish -> dish.getCalories() < 1000);
        System.out.println("isHealthy = " + isHealthy);

        // nonematch는 allmatch와 반대 연산을 수행한다.
        boolean isHealthyNonematch = menus.stream().noneMatch(d -> d.getCalories() >= 1000);
        System.out.println("isHealthyNonematch = " + isHealthyNonematch);


    }
}
