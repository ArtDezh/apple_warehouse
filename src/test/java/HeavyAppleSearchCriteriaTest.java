import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HeavyAppleSearchCriteriaTest {

    private HeavyAppleSearchCriteria criteria = new HeavyAppleSearchCriteria();

    @Test
    void test1True() {
        boolean realResult = criteria.test(new Apple("green", 156));
        assertTrue(realResult);
    }

    @Test
    void test1False() {
        boolean realResult = criteria.test(new Apple("green", 150));
        assertFalse(realResult);
    }
}