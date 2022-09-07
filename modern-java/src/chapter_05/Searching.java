package chapter_05;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Searching {

    public static void main(String[] args) {
        List<Dish> menus = Arrays.asList(
                new Dish("seasonal fruit", true, 120, Dish.Type.OTHER),
                new Dish("prawns", false, 300, Dish.Type.FISH),
                new Dish("rice", true, 350, Dish.Type.OTHER),
                new Dish("chicken", false, 400, Dish.Type.MEAT),
                new Dish("french fries", true, 530, Dish.Type.OTHER)
        );

        // findAny 메서드는 현재 스트림에서 임의의 요소를 반환한다.

        Optional<Dish> dish = menus.stream().filter(Dish::isVegetarian).findAny();

        System.out.println("dish = " + dish.isPresent());

        menus.stream()
                .filter(Dish::isVegetarian)
                .findAny()
                .ifPresent(dish2 -> System.out.println(dish2.getName()));

        // 첫번째 요소 찾기
        List<Integer> someNumbers = Arrays.asList(1, 2, 3, 4, 5);

        Optional<Integer> firstSquareDivisibleByThree = someNumbers.stream()
                .map(n -> n*n)
                .filter(n -> n % 3 == 0)
                .findFirst(); // 9

        System.out.println("firstSquareDivisibleByThree = " + firstSquareDivisibleByThree.get());


    }
}
