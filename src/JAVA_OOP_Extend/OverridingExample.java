package JAVA_OOP_Extend;

class Vehicle{
    void run() {
        System.out.println("Vehicle is running");
    }
}
class Bike extends Vehicle{ //Vehicle 상속
    void run(){ //Vehicle.run()을 오버라이딩
        System.out.println("Bike is running");
    }
}
class Car extends Vehicle { //Vehicle 상속
    void run() { //Vehicle.run()을 오버라이딩
        System.out.println("Car is running");
    }
}
class MotorBike extends Vehicle { //Vehicle 상속
    void run() { //Vehicle.run()을 오버라이딩
        System.out.println("MotorBike is running");
    }
}
public class OverridingExample {
    public static void main(String[] args) {
        //각각의 하위클래스타입 레퍼런스 = new 하위클래스타입 객체
        Bike bike = new Bike();
        Car car = new Car();
        MotorBike motorBike = new MotorBike();
        bike.run();
        car.run();
        motorBike.run();

        //상위클래스타입 레퍼런스 = new 하위클래스타입 객체 (업캐스팅)
        Vehicle bike2 = new Bike();
        Vehicle car2 = new Car();
        Vehicle motorBike2 = new MotorBike();
        bike2.run();
        car2.run();
        motorBike2.run();

        //상위클래스타입 래퍼런스를 배열로 (업캐스팅)
        Vehicle[] vehicles = new Vehicle[]{new Bike(), new Car(), new MotorBike()};
        for(Vehicle vehicle : vehicles)
            vehicle.run();
    }
}
