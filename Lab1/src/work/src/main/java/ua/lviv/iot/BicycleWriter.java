package work.src.main.java.ua.lviv.iot;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class BicycleWriter {
    public void writeToFile(List<Bicycle> bicycles, String filename){
        Map<Class<?>, List<Bicycle>> grouped = bicycles.stream()
                .collect(Collectors.groupingBy(Object::getClass));

        grouped.

        try (var writer = new FileWriter(filename)) {
            for (String[] record : bicycles) {
                String line = String.join(",", record);
                writer.write(line);
                writer.newLine();
            }
            System.out.println("Data written to " + filename);
        } catch (IOException e) {
            System.err.println("Error writing to " + filename + ": " + e.getMessage());
        }

    }
}
