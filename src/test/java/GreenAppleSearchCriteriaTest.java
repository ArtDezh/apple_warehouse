import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GreenAppleSearchCriteriaTest {

    private GreenAppleSearchCriteria criteria = new GreenAppleSearchCriteria();

    @Test
    void test1True() {
        boolean realResult = criteria.test(new Apple("green", 160));
        assertTrue(realResult);
    }

    @Test
    void test1False() {
        boolean realResult = criteria.test(new Apple("red", 160));
        assertFalse(realResult);
    }
}