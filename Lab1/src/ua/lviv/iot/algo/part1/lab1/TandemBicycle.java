package ua.lviv.iot.algo.part1.lab1;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@Getter
@Setter
@ToString
public class TandemBicycle extends AbstractBicycle {
    public double maxPassengersWeight;

    public TandemBicycle(int maxPassengersWeight, double maxSpeed, double currentSpeed) {
        super(maxSpeed, currentSpeed);

        this.maxPassengersWeight = maxPassengersWeight;
    }

    @Override
    public int getMaxDistance() {
        return (int) maxPassengersWeight * 20;
    }
}
