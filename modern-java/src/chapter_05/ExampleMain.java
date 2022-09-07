package chapter_05;

import java.util.*;
import java.util.stream.Collectors;

import static java.util.Comparator.comparing;


public class ExampleMain {

    private static Trader raoul = new Trader("Raoul", "Cambridge");
    private static Trader mario = new Trader("Mario", "Milan");
    private static Trader alan = new Trader("Alan", "Cambridge");
    private static Trader brian = new Trader("Brian", "Cambridge");

    private static List<Transaction> transactions = Arrays.asList(
            new Transaction(brian, 2011, 300),
            new Transaction(raoul, 2012, 1000),
            new Transaction(raoul, 2011, 400),
            new Transaction(mario, 2012, 710),
            new Transaction(mario, 2012, 700),
            new Transaction(alan, 2012, 950)
    );

    public static void main(String[] args) {


        // 1) 2011년에 일어난 모든 트랜잭션을 찾아 value 값을 기준으로 오름차순 정렬
        List<Transaction> arr = transactions.stream()
                .filter(transaction -> transaction.getYear() == 2011)
                .sorted(comparing(Transaction::getValue))
                .toList();

        // 2) 거래자가 근무하는 모든 도시를 중복 없이 나열하시오.
        Set<String> citis = transactions.stream()
                .map(transaction -> transaction.getTrader().getCity())
                .collect(Collectors.toSet());

        // 3) 케임브릿지 거래자 이름순 정렬
        List<String> names = transactions.stream()
                .filter(transaction -> transaction.getTrader().getCity() == "Cambridge")
                .map(transaction -> transaction.getTrader().getName())
                .sorted()
                .toList();

        // 4) 모든 거래자의 이름을 알파벳순으로 정렬해서 반환하시오
        String traderStr = transactions.stream()
                .map(transaction -> transaction.getTrader().getName())
                .distinct()
                .sorted()
                .reduce("", (n1, n2) -> n1 + n2);

        boolean isMilano = transactions.stream()
                .anyMatch(transaction -> transaction.getTrader().getCity().equals("Milan"));


        // 6) 케임브릿지에 거주하는 거래자의 모든 트랜잭션값을 출력하시오.
        transactions.stream()
                .filter(transaction -> transaction.getTrader().getCity().equals("Cambridge"))
                .map(Transaction::getValue)
                .forEach(System.out::println);


        // 7) 전체 트랜잭션 중 최댓값은 얼마인가?
        Optional<Integer> maxi = transactions.stream()
                .map(Transaction::getValue)
                .max(Integer::max);

        // 8) 전체 트랜잭션 중 최솟값은 얼마인가?
        Optional<Integer> mini = transactions.stream()
                .map(Transaction::getValue)
                .min(Integer::min);
    }
}
