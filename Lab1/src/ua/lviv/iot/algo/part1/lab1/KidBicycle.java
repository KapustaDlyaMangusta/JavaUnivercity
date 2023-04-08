package ua.lviv.iot.algo.part1.lab1;

import lombok.*;

@NoArgsConstructor
@Getter
@Setter
@ToString
public class KidBicycle extends AbstractBicycle{
    public int recommendedAge;
    public int wheelsCount;

    public KidBicycle(int recommendedAge, int wheelsCount, double maxSpeed, double currentSpeed) {
        super(maxSpeed, currentSpeed);

        this.recommendedAge = recommendedAge;
        this.wheelsCount = wheelsCount;
    }

    @Override
    public int getMaxDistance() {
        return recommendedAge % 3 * 10;
    }
}
