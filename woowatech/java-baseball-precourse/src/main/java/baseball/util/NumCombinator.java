package baseball.util;

import camp.nextstep.edu.missionutils.Randoms;

import java.util.HashSet;
import java.util.Set;

public class NumCombinator {
    private final Set<Integer> numbers = new HashSet<>();

    private NumCombinator() {

    }

    public Set<Integer> selectNumbers() {
        while(isSelectedEnd()) {
            int number = Randoms.pickNumberInRange(1, 9);
            numbers.add(number);
        }
        return this.numbers;
    }

    private boolean isSelectedEnd() {
        return numbers.size() == 3;
    }
}
