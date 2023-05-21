package work.src.main.java.ua.lviv.iot;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.lang.reflect.Field;
import java.util.Arrays;

@AllArgsConstructor
public abstract class AbstractBicycle {
    private static int globalId;

    public AbstractBicycle() {
        setId();
    }

    public AbstractBicycle(final double maxSpeed, final double currentSpeed) {
        setId();

        this.maxSpeed = maxSpeed;
        this.currentSpeed = currentSpeed;
    }

    @Getter
    private int id;
    @Getter
    @Setter
    private double maxSpeed;
    @Getter
    @Setter
    private double currentSpeed;

    public abstract int getMaxDistance();

    public String getHeaders() {
        return "id, maxSpeed, currentSpeed";
    }

    public String toCSV() {
        return id + ", " + maxSpeed + ", " + currentSpeed;
    }

    private void setId() {
        ++globalId;
        id = globalId;
    }
}
