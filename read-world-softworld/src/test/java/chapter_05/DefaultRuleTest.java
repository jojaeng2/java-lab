package chapter_05;

import org.junit.jupiter.api.Test;

public class DefaultRuleTest {

    @Test
    void test() {
        final Condition condition = (Facts facts) -> "CEO".equals(facts.getFact("jobTitle"));

    }
}
