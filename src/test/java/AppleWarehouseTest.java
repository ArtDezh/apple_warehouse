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
        List<Apple> realResult = appleWarehouse.findHeavyApples();
        assertEquals(4, realResult.size());
    }
}