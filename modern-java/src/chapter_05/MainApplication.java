package chapter_05;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MainApplication {

    public static void main(String[] args) {
        List<Dish> specialMenu = Arrays.asList(
                new Dish("seasonal fruit", true, 120, Dish.Type.OTHER),
                new Dish("prawns", false, 300, Dish.Type.FISH),
                new Dish("rice", true, 350, Dish.Type.OTHER),
                new Dish("chicken", false, 400, Dish.Type.MEAT),
                new Dish("french fries", true, 530, Dish.Type.OTHER)
        );


        // 기존 방법
        List<Dish> lowCaloric = specialMenu.stream()
                .filter(dish -> dish.getCalories() < 320)
                .toList();

        // TakeWhile 활용
        List<Dish> sliceMenu1 = specialMenu.stream()
                .takeWhile(dish -> dish.getCalories() < 320)
                .toList();

        // DropWhile 활용
        List<Dish> sliceMenu2 = specialMenu.stream()
                .dropWhile(dish -> dish.getCalories() < 320)
                .toList();


        // 스트림 축소
        List<Dish> dishes = specialMenu.stream()
                .filter(dish -> dish.getCalories() > 300)
                .limit(3)
                .toList();

        // 요소 건너뛰기
        List<Dish> dishesSkipIdx = specialMenu.stream()
                .filter(d -> d.getCalories() > 300)
                .skip(2)
                .toList();


        // 스트림의 각 요소에 함수 적용하기
        List<String> dishNames = specialMenu.stream()
                .map(Dish::getName)
                .toList();


        List<String> words = Arrays.asList("Modern", "Java", "In", "Action");

        List<Integer> wordLengths = words.stream()
                .map(String::length)
                .toList();

        // 스트림의 map 요소 연결
        List<Integer> dishNameLengths = specialMenu.stream()
                .map(Dish::getName)
                .map(String::length)
                .toList();


        // 스트림의 평면화 - flatMap 사용
        List<String> uniqueCharacters = words.stream()
                .map(word -> word.split(""))
                .flatMap(Arrays::stream)
                .distinct()
                .toList();


    }
}
