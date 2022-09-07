import java.util.ArrayList;
import java.util.Comparator;
import static java.util.Comparator.*;


public class AppleComparator implements Comparator<Apple> {
    public int compare(Apple a1, Apple a2) {
        return a1.getWeight().compareTo(a2.getWeight());
    }

    public static void main(String[] args) {
        ArrayList<Apple> inventory = new ArrayList<>();
        inventory.sort(new AppleComparator());

        inventory.sort(new Comparator<Apple>() {
            @Override
            public int compare(Apple o1, Apple o2) {
                return o1.getWeight().compareTo(o2.getWeight());
            }
        });

        inventory.sort((a1, a2) -> a1.getWeight().compareTo(a2.getWeight()));

        Comparator<Apple> c = Comparator.comparing((Apple a) -> a.getWeight());

        inventory.sort(comparing(apple -> apple.getWeight()));

        inventory.sort(comparing(Apple::getWeight));
    }


}
