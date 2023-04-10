package work.src.main.java.ua.lviv.iot;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

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

    private void setId() {
        ++globalId;
        id = globalId;
    }
}
