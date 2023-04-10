package work.src.test.java.ua.lviv.iot;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import work.src.main.java.ua.lviv.iot.Bicycle;

import static org.junit.jupiter.api.Assertions.*;

public class BicycleTest {

    private Bicycle bicycle;

    @BeforeEach
    public void setUp(){
        bicycle = new Bicycle("type", "brand", 45, 30);
    }

    @Test
    public void testGetMaxDistance() {
        var expectedValue = Integer.MAX_VALUE;

        assertEquals(expectedValue, bicycle.getMaxDistance());
    }

    @Test
    public void testAccelerate() {
        var speedBefore = bicycle.getCurrentSpeed();

        bicycle.accelerate(5);

        var acceleratedSpeed = bicycle.getCurrentSpeed();

        assertTrue(acceleratedSpeed > speedBefore && acceleratedSpeed == speedBefore + 5);
    }

    @Test
    public void testAccelerateIfSpeedZero() {
        var speedBefore = bicycle.getCurrentSpeed();

        bicycle.accelerate(0);

        var acceleratedSpeed = bicycle.getCurrentSpeed();

        assertEquals(speedBefore, acceleratedSpeed);
    }

    @Test
    public void testAccelerateNotHigherThanMaxSpeed() {
        var maxSpeed = bicycle.getMaxSpeed();

        bicycle.accelerate(1000);

        var currentSpeed = bicycle.getCurrentSpeed();

        assertEquals(maxSpeed, currentSpeed);
    }

    @Test
    public void testBrake() {
        bicycle.brake();

        assertEquals(0, bicycle.getCurrentSpeed());
    }

    @Test
    public void testSlowDown() {
        var speedBefore = bicycle.getCurrentSpeed();

        bicycle.slowDown(10);

        var slowedDownSpeed = bicycle.getCurrentSpeed();

        assertTrue(slowedDownSpeed < speedBefore && slowedDownSpeed == speedBefore - 10);
    }

    @Test
    public void testSlowDownNotLowerThanZero() {
        bicycle.slowDown(1000);

        var currentSpeed = bicycle.getCurrentSpeed();

        assertEquals(0, currentSpeed);
    }
}