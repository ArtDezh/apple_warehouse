import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LightAppleSearchCriteriaTest {

    private LightAppleSearchCriteria criteria = new LightAppleSearchCriteria();

    @Test
    void test1True() {
        boolean realResult = criteria.test(new Apple("red", 140));
        assertTrue(realResult);
    }

    @Test
    void test1False() {
        boolean realResult = criteria.test(new Apple("red", 175));
        assertFalse(realResult);
    }
}