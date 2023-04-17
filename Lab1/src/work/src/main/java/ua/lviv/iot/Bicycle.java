package work.src.main.java.ua.lviv.iot;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Getter
public class Bicycle extends AbstractBicycle {
    private String type;
    private String brand;

    public Bicycle(final String type,
                   final String brand,
                   final double maxSpeed,
                   final double currentSpeed) {
        super(maxSpeed, currentSpeed);

        this.type = type;
        this.brand = brand;
    }

    @Override
    public final int getMaxDistance() {
        return Integer.MAX_VALUE;
    }

    public final void accelerate(final int speed) {
        setCurrentSpeed(Math.min(getMaxSpeed(),
                getCurrentSpeed() + speed));
    }

    public final void brake() {
        setCurrentSpeed(0);
    }

    public final void slowDown(final double speed) {
        setCurrentSpeed(getCurrentSpeed() - speed >= 0
                ? getCurrentSpeed() - speed
                : 0);
    }

    public String toCSV() {
        return super.toCSV() + type + "," + brand;
    }
}
