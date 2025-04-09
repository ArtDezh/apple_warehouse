import org.junit.jupiter.api.Test;

import java.awt.*;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class AppleWarehouseTest {

   private AppleWarehouse appleWarehouse = new AppleWarehouse();

/*

    @Test
    void getListOfGreenApples() {
        AppleWarehouse appleWarehouse = new AppleWarehouse();
        List<Apple> realResult = appleWarehouse.findApplesByColor("green");
        assertEquals(3, realResult.size());
    }

    @Test
    void getListOfRedApples() {
        AppleWarehouse appleWarehouse = new AppleWarehouse();
        List<Apple> realResult = appleWarehouse.findApplesByColor("red");
        assertEquals(4, realResult.size());
    }
*/

    @Test
    void findApplesByColor() {
        List<Apple> realResultRedApples = appleWarehouse.findApplesByColor("red");
        assertEquals(4, realResultRedApples.size());

        List<Apple> realResultGreenApples = appleWarehouse.findApplesByColor("green");
        assertEquals(3, realResultGreenApples.size());
    }

    @Test
    void findHeavyApples() {
        List<Apple> realResult = appleWarehouse.findHeavyApples(150);
        assertEquals(4, realResult.size());
    }

    @Test
    void findApplesByCriteria() {
        List<Apple> greenApples = appleWarehouse.findApples(new GreenAppleSearchCriteria());
        assertEquals(3, greenApples.size());

        List<Apple> redApples = appleWarehouse.findApples(new RedAppleSearchCriteria());
        assertEquals(4, redApples.size());

        List<Apple> lightApples = appleWarehouse.findApples(new LightAppleSearchCriteria());
        assertEquals(5, lightApples.size());

        List<Apple> heavyApples = appleWarehouse.findApples(new HeavyAppleSearchCriteria());
        assertEquals(4, heavyApples.size());
    }

    @Test
    void findApplesWithAnonymousClass() {
        List<Apple> greenApples = appleWarehouse.findApples(apple -> "green".equals(apple.getColor()));
        assertEquals(3, greenApples.size());

        List<Apple> redApples = appleWarehouse.findApples(apple -> "red".equals(apple.getColor()));

        assertEquals(4, redApples.size());

        List<Apple> lightApples = appleWarehouse.findApples(apple -> apple.getWeight() <= 150);

        assertEquals(5, lightApples.size());

        List<Apple> heavyApples = appleWarehouse.findApples(apple -> apple.getWeight() > 150);

        assertEquals(4, heavyApples.size());
    }
}