package chapter_07.src;

import java.util.stream.LongStream;

public class AcceptParallelStream {

    public long sideEffectSum(long n) {
        Accumulator accumulator = new Accumulator();
        LongStream.rangeClosed(1, n).forEach(accumulator::add);
        return accumulator.total;
    }

    public static long sideEffectParallelSum(long n) {
        Accumulator accumulator = new Accumulator();
        LongStream.rangeClosed(1, n).parallel().forEach(accumulator::add);
        return accumulator.total;
    }

    public static void main(String[] args) {
        long result = sideEffectParallelSum(10000000L);
        System.out.println("SideEffect parallel sum done in: " + result);
    }

    public static class Accumulator {
        public long total = 0;
        public void add(long value) {
            this.total += value;
        }
    }
}
