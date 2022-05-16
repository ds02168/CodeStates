package JAVA_OOP_Extend;

class Vehicle{
    void run() {
        System.out.println("Vehicle is running");
    }
}
class Bike extends Vehicle{
    void run(){
        System.out.println("Bike is running");
    }
}
class Car extends Vehicle {
    void run() {
        System.out.println("Car is running");
    }
}
class MotorBike extends Vehicle {
    void run() {
        System.out.println("MotorBike is running");
    }
}
public class OverridingExample {
    public static void main(String[] args) {
        
        Bike bike = new Bike();
        Car car = new Car();
        MotorBike motorBike = new MotorBike();
        bike.run();
        car.run();
        motorBike.run();

        
        Vehicle bike2 = new Bike();
        Vehicle car2 = new Car();
        Vehicle motorBike2 = new MotorBike();
        bike2.run();
        car2.run();
        motorBike2.run();

        
        Vehicle[] vehicles = new Vehicle[]{new Bike(), new Car(), new MotorBike()};
        for(Vehicle vehicle : vehicles)
            vehicle.run();
    }
}
