import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Reducing {
    List<Integer> numbers = Arrays.asList(1, 2, 1, 3, 3, 2, 4);

    int sum = numbers.stream().reduce(0, (a, b) -> a + b);

    Optional<Integer> max = numbers.stream().reduce(Integer::max);

}
