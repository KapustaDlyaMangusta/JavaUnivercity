package ua.lviv.iot.algo.part1.lab1;

import lombok.*;

@Getter
@AllArgsConstructor
public abstract class AbstractBicycle {
    private static int ID;

    public AbstractBicycle() {
        setId();
    }

    public AbstractBicycle(double maxSpeed, double currentSpeed){
        setId();

        this.maxSpeed = maxSpeed;
        this.currentSpeed = currentSpeed;
    }

    public int id;
    @Setter
    public double maxSpeed;
    @Setter
    public double currentSpeed;

    public int getMaxDistance() {
        return 0;
    }

    private void setId(){
        ++ID;
        id = ID;
    }
}
