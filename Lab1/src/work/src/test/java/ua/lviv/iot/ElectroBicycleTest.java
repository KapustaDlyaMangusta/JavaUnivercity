package work.src.test.java.ua.lviv.iot;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import work.src.main.java.ua.lviv.iot.Bicycle;
import work.src.main.java.ua.lviv.iot.ElectroBicycle;

import static org.junit.jupiter.api.Assertions.*;

public class ElectroBicycleTest {

    private ElectroBicycle bicycle;

    @BeforeEach
    public void setUp() {
        bicycle = new ElectroBicycle(30000, 300, 45, 30);
    }
    @Test
    public void testGetMaxDistance() {
        var expectedDistance = 100;

        assertEquals(expectedDistance, bicycle.getMaxDistance());
    }

    @Test
    public void testGetMaxDistanceZeroDividingException() {
        bicycle.setChargePer100m(0);

        assertThrows(ArithmeticException.class , () -> bicycle.getMaxDistance());
    }
}