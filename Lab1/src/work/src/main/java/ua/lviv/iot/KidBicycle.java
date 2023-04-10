package work.src.main.java.ua.lviv.iot;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
public class KidBicycle extends AbstractBicycle {
    private static final int DISTANCE_COEFFICIENT = 10;
    private static final int DIVIDING_AGE_COEFFICIENT = 3;
    @Getter
    @Setter
    private int recommendedAge;
    private int wheelsCount;

    public KidBicycle(final int recommendedAge,
                      final int wheelsCount,
                      final double maxSpeed,
                      final double currentSpeed) {
        super(maxSpeed, currentSpeed);

        this.recommendedAge = recommendedAge;
        this.wheelsCount = wheelsCount;
    }

    @Override
    public final int getMaxDistance() {
        return recommendedAge % DIVIDING_AGE_COEFFICIENT * DISTANCE_COEFFICIENT;
    }
}
