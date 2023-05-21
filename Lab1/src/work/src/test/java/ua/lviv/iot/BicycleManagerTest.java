package work.src.test.java.ua.lviv.iot;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import work.src.main.java.ua.lviv.iot.*;

import java.util.NoSuchElementException;

import static org.junit.jupiter.api.Assertions.*;

public class BicycleManagerTest {

    private BicycleManager bicycleManager;

    @BeforeEach
    public void setUp() {
        bicycleManager = new BicycleManager();

        bicycleManager.addBicycle(new KidBicycle(3, 4, 300, 20));
        bicycleManager.addBicycle(new TandemBicycle(300, 600,20));
        bicycleManager.addBicycle(new ElectroBicycle(30000, 100, 250, 7-0));
        bicycleManager.addBicycle(new Bicycle("Cool","Lanos", 70,20));
        bicycleManager.addBicycle(new KidBicycle(5, 3, 100, 20));
        bicycleManager.addBicycle(new TandemBicycle(100, 60,20));
        bicycleManager.addBicycle(new ElectroBicycle(42200, 80, 100, 7-0));
        bicycleManager.addBicycle(new Bicycle("Super","Lanos", 90,20));
    }
    @Test
    public void testAddBicycle() {
        var initialSize = bicycleManager.getBicycles().size();
        bicycleManager.addBicycle(new ElectroBicycle(12, 12, 10, 5));
        assertTrue(initialSize < bicycleManager.getBicycles().size());
    }

    @Test
    public void testClearBicycles() {
        bicycleManager.clearBicycles();
        assertTrue(bicycleManager.getBicycles().isEmpty());
    }

    @Test
    public void testGetBicyclesFasterThan() {
        var fastBicycles = bicycleManager.getBicyclesFasterThan(200);

        assertEquals(3, fastBicycles.size());

        for (var bicycle : fastBicycles) {
            assertTrue(bicycle.getMaxSpeed() > 200);
        }
    }

    @Test
    public void testEmptyListGetFasterThan() {
        bicycleManager.clearBicycles();
        assertTrue(bicycleManager.getBicyclesFasterThan(100).isEmpty());
    }

    @Test
    void testGetBicycleById() {
        var newBicycle = new Bicycle("Cool", "Blabla", 200, 400);
        var expectedBicycleId = newBicycle.getId();
        bicycleManager.addBicycle(newBicycle);
        assertEquals(newBicycle, bicycleManager.getBicycleById(expectedBicycleId));
    }

    @Test
    void testGetBicycleByIdNoSuchElement() {
        var newBicycle = new Bicycle("Cool", "Blabla", 200, 400);
        var expectedBicycleId = newBicycle.getId();
        assertThrows(NoSuchElementException.class, () -> bicycleManager.getBicycleById(expectedBicycleId));
    }
}