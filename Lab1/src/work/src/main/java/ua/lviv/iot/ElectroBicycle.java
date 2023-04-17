package work.src.main.java.ua.lviv.iot;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
public class ElectroBicycle extends AbstractBicycle {
    private int batteryCapacity;
    @Setter
    private int chargePer100m;

    public ElectroBicycle(final int batteryCapacity,
                          final int chargePer100m,
                          final double maxSpeed,
                          final double currentSpeed) {
        super(maxSpeed, currentSpeed);

        this.batteryCapacity = batteryCapacity;
        this.chargePer100m = chargePer100m;
    }

    @Override
    public final int getMaxDistance() {
        return batteryCapacity / chargePer100m;
    }

    public String getHeaders() {
        return super.getHeaders() + ", batteryCapacity, chargePer100m";
    }

    public String toCSV() {
        return super.toCSV() + ", " + batteryCapacity + ", " + chargePer100m;
    }
}
