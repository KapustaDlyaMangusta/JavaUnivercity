package work.src.main.java.ua.lviv.iot;

import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class BicycleWriter {
    public void writeToFile(List<AbstractBicycle> bicycles, String filename) {
        List<Class<AbstractBicycle>> bicycleHeaders = new ArrayList<>();

        bicycles.sort(Comparator.comparing(o -> o.getClass().getName()));

        try (FileWriter writer = new FileWriter(filename)) {
            for (var bicycle : bicycles) {
                var bicycleClass = bicycle.getClass();

                if (!bicycleHeaders.stream().anyMatch(h -> Objects.equals(h, bicycleClass))) {
                    writer.write(bicycle.getHeaders() + "\n");
                    bicycleHeaders.add((Class<AbstractBicycle>) bicycleClass);
                }

                writer.write(bicycle.toCSV() + "\n");
            }
        } catch (
                IOException ignored) {
        }
    }
}
