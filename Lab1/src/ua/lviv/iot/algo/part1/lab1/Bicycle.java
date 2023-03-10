package ua.lviv.iot.algo.part1.lab1;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Bicycle {
    private String type;
    private String brand;
    private double maxSpeed;
    private double currentSpeed;
    private static Bicycle instance = new Bicycle();

    public static Bicycle getInstance() {
        return instance;
    }

    public void accelerate(int speed){
        currentSpeed = Math.min(maxSpeed, currentSpeed + speed);
    }

    public void brake(){
        currentSpeed = 0;
    }

    public void slowDown(double speed){
        currentSpeed = currentSpeed - speed >= 0 ? currentSpeed - speed : 0;
    }
    public static void main(String[] args) {
        var bicycles = new Bicycle[]{ new Bicycle(),
                new Bicycle("гірський", "Deo Lanos", 123, 12),
                Bicycle.getInstance(),
                Bicycle.getInstance()};

        for (Bicycle bicycle : bicycles)
        {
            System.out.println(bicycle.hashCode() + "\n");
        }
    }
}