package chapter_07.src;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class ParallelStreamExample {

    public long sequentialSum(long n) {
        return Stream.iterate(1L, i -> i+1)
                .limit(n)
                .reduce(0L, Long::sum);
    }

    public long iterativeSum(long n) {
        long result = 0;
        for(long i=1L; i<=n; i++) {
            result += i;
        }
        return result;
    }

    public long parallelSum(long n) {
        return Stream.iterate(1L, i -> i+1)
                .limit(n)
                .parallel()
                .reduce(0L, Long::sum);
    }

    public void sequentialToParallel() {
//        List<Integer> arrays = List.of(1, 2, 3, ...);
//        arrays.stream().parallel()
//                .filter(...)
//                .sequential()
//                .map(...)
//                .parallel()
//                .reduce();
    }
}
