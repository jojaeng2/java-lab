package chapter_08.src;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectionFactoryMain {

    public static void main(String[] args) {

        // Arrays.asList 팩토리 메서드 사용
        List<String> friends = Arrays.asList("Raphael", "Olivia", "Thibaut");

        Set<String> friends2 = new HashSet<>(Arrays.asList("Raphael", "Olivia", "Thibaut"));

        Set<String> friends3 = Stream.of("Raphael", "Olivia", "Thibaut")
                .collect(Collectors.toSet());
    }

}
