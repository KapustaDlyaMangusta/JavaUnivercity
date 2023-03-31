package ua.lviv.iot.algo.part1.lab1;

import lombok.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Getter
public class BicycleManager {
    private static final BicycleManager instance = new BicycleManager();

    public static BicycleManager getInstance() {
        return instance;
    }

    public List<AbstractBicycle> bicycles = new ArrayList<>();

    public void addBicycle(final AbstractBicycle bicycle) {
        bicycles.add(bicycle);
    }

    public List<AbstractBicycle> getBicyclesFasterThan(int speed) {
        return bicycles
                .stream()
                .filter(t -> t.maxSpeed > speed)
                .toList();
    }

    public AbstractBicycle getBicycleById(int id) {
        return bicycles
                .stream()
                .filter(t -> t.id == id)
                .findFirst()
                .get();
    }

    public static void main(String[] args) {
        var bicycleManager = BicycleManager.getInstance();

        var bicycleList = Arrays.asList(
                new ElectroBicycle(12000, 100, 40, 20),
                new ElectroBicycle(15000, 80, 60, 50),
                new Bicycle("type", "brand", 45, 30),
                new Bicycle("type", "brand"),
                new KidBicycle(5, 4, 12, 43),
                new KidBicycle(8, 3, 30, 12),
                new TandemBicycle(100, 30, 10),
                new TandemBicycle(130, 180, 185));

        for (var bicycle : bicycleList) {
            bicycleManager.addBicycle(bicycle);
        }

        for (var bicycle : bicycleManager.bicycles) {
            System.out.println(bicycle);
        }

        System.out.println("\n ////////////////////////////////////////// \n");

        var fastBicycles = bicycleManager.getBicyclesFasterThan(60);

        for (var bicycle : fastBicycles) {
            System.out.println(bicycle);
        }

        System.out.println("\n ////////////////////////////////////////// \n");

        var bicycle = bicycleManager.getBicycleById(2);
        System.out.println(bicycle);
    }
}
