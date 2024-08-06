class Movable {
    public void move() {
        System.out.println("Moving...");
    }
}

interface Drivable {
    void drive();
}

interface Flyable {
    void fly();
}

class Vehicle extends Movable implements Drivable, Flyable {
    @Override
    public void drive() {
        System.out.println("Driving...");
    }

    @Override
    public void fly() {
        System.out.println("Flying...");
    }
}

public class a2 {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        vehicle.move();
        vehicle.drive();
        vehicle.fly();
    }
}
