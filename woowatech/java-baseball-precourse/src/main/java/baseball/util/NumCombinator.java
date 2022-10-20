package baseball.util;

import camp.nextstep.edu.missionutils.Randoms;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class NumCombinator {
    private final List<Integer> numbers;

    public NumCombinator() {
        this.numbers = new ArrayList<>();
    }

    public List<Integer> selectNumbers() {
        while(isSelectedEnd()) {
            Integer number = Randoms.pickNumberInRange(1, 9);
            if(isSelectedBefore(number)) {
                numbers.add(number);
            }
        }
        return numbers;
    }

    private boolean isSelectedEnd() {
        return numbers.size() == 3;
    }

    private boolean isSelectedBefore(Integer number) {
        return numbers.contains(number);
    }
}
