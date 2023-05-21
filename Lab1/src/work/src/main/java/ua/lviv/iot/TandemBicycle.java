package work.src.main.java.ua.lviv.iot;

import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
public class TandemBicycle extends AbstractBicycle {
    private static final int DISTANCE_COEFFICIENT = 20;

    @Getter
    private double maxPassengersWeight;

    public TandemBicycle(final int maxPassengersWeight,
                         final double maxSpeed,
                         final double currentSpeed) {
        super(maxSpeed, currentSpeed);

        this.maxPassengersWeight = maxPassengersWeight;
    }

    @Override
    public final int getMaxDistance() {
        return (int) maxPassengersWeight * DISTANCE_COEFFICIENT;
    }

    public String getHeaders() {
        return super.getHeaders() + ", maxPassengersWeight";
    }

    public String toCSV() {
        return super.toCSV() + ", " + maxPassengersWeight;
    }
}
