package work.src.test.java.ua.lviv.iot;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import work.src.main.java.ua.lviv.iot.KidBicycle;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class KidBicycleTest {

    private KidBicycle bicycle;

    @BeforeEach
    public void setUp() {
        bicycle = new KidBicycle(7, 3, 45, 30);
    }

    @Test
    void testGetMaxDistance() {
        var expected = bicycle.getRecommendedAge() % 3 * 10;

        assertEquals(expected, bicycle.getMaxDistance());
    }
}