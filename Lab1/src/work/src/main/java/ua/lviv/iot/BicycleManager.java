package work.src.main.java.ua.lviv.iot;

import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@Getter
public class BicycleManager {

    private final List<AbstractBicycle> bicycles = new ArrayList<>();

    public final void addBicycle(final AbstractBicycle bicycle) {
        bicycles.add(bicycle);
    }

    public final void clearBicycles() {
        bicycles.clear();
    }

    public final List<AbstractBicycle> getBicyclesFasterThan(final int speed) {
        return bicycles
                .stream()
                .filter(t -> t.getMaxSpeed() > speed)
                .toList();
    }

    public final AbstractBicycle getBicycleById(final int id) {
        return bicycles
                .stream()
                .filter(t -> t.getId() == id)
                .findFirst()
                .get();
    }
}
