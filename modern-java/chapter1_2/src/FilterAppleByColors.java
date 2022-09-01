import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class FilterAppleByColors {


    public static void main(String[] args) {
        List<Apple> greenColorApple = Apple.filterApples(new ArrayList<>(), new AppleGreenColorPredicate());
    }
}
