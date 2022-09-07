package chapter_05;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Reducing {

    /**
     * reducing 연산
     *
     * 스트림 요소를 조합해서 더 복잡한 질의를 표현하는 방법
     * -> 이러한 질의를 수행하기 위해서는 Integer 같은 결과가 나올때까지 스트림의 모든 요소를 반복적으로 처리해야 하고, 이것이 reducing 연산이다.
     *
     * 함수형 프로그래밍 언어 용어로는 이 과정이 마치 종이를 작은 조각이 될 때까지 반복해서 접는것과 비슷하다는 의미로 '폴드'라고 부른다.
     *
     */
    public static void main(String[] args) {

        // 요소의 합 - for-each 사용
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        int sum = 0;
        for(int x : numbers) {
            sum += x;
        }

        System.out.println("sum = " + sum);

        // 요소의 합 - stream 사용
        int sum2 = numbers.stream().reduce(0, Integer::sum);

        System.out.println("sum2 = " + sum2);

        // 초깃값 없는 reduce
        Optional<Integer> sum3 = numbers.stream().reduce((a, b) -> (a+b));

        // 최댓값과 최솟값
        Optional<Integer> maxi = numbers.stream().reduce(Integer::max);

        Optional<Integer> mini1 = numbers.stream().reduce(Integer::min);
        Optional<Integer> mini2 = numbers.stream().reduce((x, y) -> x < y ? x : y);

        Long count = numbers.stream().count();
        System.out.println("count = " + count);

        // 스트림의 모든 요소를 병렬로 더하는 방법
        int sum4 = numbers.parallelStream().reduce(0, Integer::sum);


    }

}
