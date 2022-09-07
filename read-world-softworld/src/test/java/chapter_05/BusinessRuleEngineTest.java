package chapter_05;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class BusinessRuleEngineTest {

//    @Test
//    void shouldHaveNoRulesInitially() {
//        final BusinessRuleEngine businessRuleEngine = new BusinessRuleEngine();
//        assertEquals(0, businessRuleEngine.count());
//    }
//
//    @Test
//    void shouldAddTwoActions() {
//        final BusinessRuleEngine businessRuleEngine = new BusinessRuleEngine();
//
//        businessRuleEngine.addAction(() -> {});
//        businessRuleEngine.addAction(() -> {});
//        assertEquals(2, businessRuleEngine.count());
//    }
//
//    @Test
//    void shouldExecuteOneAction() {
//        final BusinessRuleEngine businessRuleEngine = new BusinessRuleEngine();
//        final Action mockAction = mock(Action.class);
//
//        businessRuleEngine.addAction(mockAction);
//        businessRuleEngine.run();
//        verify(mockAction).perform();
//    }
//
//    @Test
//    public void shouldPerformAnActionWithFacts() {
//        final Action mockAction = mock(Action.class);
//        final Facts mockFacts = mock(Facts.class);
//        final BusinessRuleEngine businessRuleEngine = new BusinessRuleEngine(mockedFacts);
//
//        businessRuleEngine.addAction(facts -> {
//            final String jobTitle = facts.getFact("jobTitle");
//            if("CEO".equals(jobTitle)) {
//                final String name = facts.getFact("name");
//
//            }
//        });
//        businessRuleEngine.run();
//
//        verify(mockAction).perform(mockFacts);
//    }

    @Test
    public void switchTest() {
        int amount = 0;
        Stage delStage = Stage.LEAD;

        // 자바 12부터 적용가능
//        var forcastedamount = amount * switch(delStage) {
//            case LEAD -> 0.2;
//            case EVALUATING -> 0.5;
//            case INTERESTED -> 0.8;
//            case CLOSED -> 1;
//        }
    }


}
