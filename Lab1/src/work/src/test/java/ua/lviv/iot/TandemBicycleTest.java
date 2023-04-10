package work.src.test.java.ua.lviv.iot;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import work.src.main.java.ua.lviv.iot.KidBicycle;
import work.src.main.java.ua.lviv.iot.TandemBicycle;

import static org.junit.jupiter.api.Assertions.*;

public class TandemBicycleTest {

    private TandemBicycle bicycle;

    @BeforeEach
    public void setUp() {
        bicycle = new TandemBicycle(20,  45, 30);
    }

    @Test
    public void testGetMaxDistance() {
        var expected = (int)bicycle.getMaxPassengersWeight() * 20;

        assertEquals(expected, bicycle.getMaxDistance());
    }
}