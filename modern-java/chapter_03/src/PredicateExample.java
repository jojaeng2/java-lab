import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class PredicateExample {

    public <T>List<T> filter(List<T> list, Predicate<T> p) {
        List<T> results = new ArrayList<>();

        for (T t : list) {
            if(p.test(t)) {
                results.add(t);
            }
        }

        return results;
    }

    Predicate<String> nonEmptyStringPredicate = (String s) -> !s.isEmpty();
//    List<String> nonEmpty = filter(listOfStrings, nonEmptyStringPredicate);
}
