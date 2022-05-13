package JAVA_OOP_Extend;

class Vehicle2{ //상위 클래스
    String model;

    void startEngine() {
        System.out.println("시동 걸기");
    }
}

class Car2 extends Vehicle2{ //하위 클래스
    void giveRide() {
        System.out.println("다른 사람 태우기");
    }
}

class MotorBike2 extends Vehicle2{ //하위 클래스
    void performance() {
        System.out.println("묘기 부리기");
    }
}

public class VehicleTest {
    public static void main(String[] args) {
        Car2 car = new Car2(); //하위클래스 참조변수 = 하위클래스 객체
        Vehicle2 vehicle = car; //상위클래스로 형변환 ()는 생략 가능, 업캐스팅
        Car2 car2 = (Car2)vehicle; //하위클래스로 형변환 (타입)명시 필수, 다운캐스팅
//        MotorBike2 motorBike = (MotorBike2) car;
// motorBike와 car는 상속관계가 아니므로 형변환 불가능
//        MotorBike2 motorBike = (MotorBike2) vehicle;
// 다른 하위클래스에서 상위클래스로 업캐스팅된 클래스를 또 다른 하위클래스로 다운캐스팅 불가능

        car.startEngine(); //하위 클래스 참조 변수에서 호출
        car.giveRide(); //하위 클래스 참조 변수에서 호출
//        vehicle.giveRide();
// (업캐스팅 된)상위 클래스 참조 변수에서 하위 클래스 메서드 호출 불가능
    }
}
