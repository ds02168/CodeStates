package JAVA_OOP_Extend;

class Vehicle2{
    String model;

    void startEngine() {
        System.out.println("시동 걸기");
    }
}

class Car2 extends Vehicle2{
    void giveRide() {
        System.out.println("다른 사람 태우기");
    }
}

class MotorBike2 extends Vehicle2{
    void performance() {
        System.out.println("묘기 부리기");
    }
}

public class VehicleTest {
    public static void main(String[] args) {
        Car2 car = new Car2(); 
        Vehicle2 vehicle = car; 
        Car2 car2 = (Car2)vehicle; 

        car.startEngine();
        car.giveRide();
    }
}
