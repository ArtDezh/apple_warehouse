import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RedAppleSearchCriteriaTest {

    private RedAppleSearchCriteria criteria = new RedAppleSearchCriteria();

    @Test
    void test1True() {
        boolean realResult = criteria.test(new Apple("red", 130));
        assertTrue(realResult);
    }

    @Test
    void test1False() {
        boolean realResult = criteria.test(new Apple("yellow", 130));
        assertFalse(realResult);
    }
}