package ua.lviv.iot.algo.part1.lab1;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Bicycle extends AbstractBicycle {
    private String type;
    private String brand;

    public Bicycle(String type, String brand, double maxSpeed, double currentSpeed) {
        super(maxSpeed, currentSpeed);

        this.type = type;
        this.brand = brand;
    }

    @Override
    public int getMaxDistance() {
        return Integer.MAX_VALUE;
    }

    public void accelerate(int speed) {
        currentSpeed = Math.min(maxSpeed, currentSpeed + speed);
    }

    public void brake() {
        currentSpeed = 0;
    }

    public void slowDown(double speed) {
        currentSpeed = currentSpeed - speed >= 0 ? currentSpeed - speed : 0;
    }
}