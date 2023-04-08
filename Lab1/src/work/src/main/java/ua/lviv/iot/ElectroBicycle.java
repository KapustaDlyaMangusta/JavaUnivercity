package work.src.main.java.ua.lviv.iot;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class ElectroBicycle extends AbstractBicycle {
    public int batteryCapacity;
    public int chargePer100m;

    public ElectroBicycle(int batteryCapacity, int chargePer100m, double maxSpeed, double currentSpeed) {
        super(maxSpeed, currentSpeed);

        this.batteryCapacity = batteryCapacity;
        this.chargePer100m = chargePer100m;
    }

    @Override
    public int getMaxDistance() {
        return Integer.MAX_VALUE / chargePer100m;
    }
}
