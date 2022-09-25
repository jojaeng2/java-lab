package chapter_08.src;

import java.util.List;
import java.util.Set;

public class ListFactoryMain {

    public static void main(String[] args) {

        List<String> friends = List.of("Raphael", "Olivia", "Thibaut");


        Set<String> friends2 = Set.of("Raphael", "Olivia", "Olivia");
        System.out.println("friends2 = " + friends2);
    }
}
