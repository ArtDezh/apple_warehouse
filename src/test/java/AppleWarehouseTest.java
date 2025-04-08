import org.junit.jupiter.api.Test;

import java.awt.*;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class AppleWarehouseTest {

    @Test
    void getListOfGreenApples() {
        AppleWarehouse appleWarehouse = new AppleWarehouse();
        List<Apple> realResult = appleWarehouse.getListOfGreenApples();
        assertEquals(3, realResult.size());
    }

    @Test
    void getListOfRedApples() {
        AppleWarehouse appleWarehouse = new AppleWarehouse();
        List<Apple> realResult = appleWarehouse.getListOfRedApples();
        assertEquals(4, realResult.size());
    }
}