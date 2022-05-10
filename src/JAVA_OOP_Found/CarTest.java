package JAVA_OOP_Found;

public class CarTest {
    public static void main(String[] args){
        Car tesla = new Car("Model 3", "빨강"); // 객체 생성. 정의한 생성자의 매개변수의 갯수, 타입에 맞춰서 인자를 넘깁니다.

        System.out.println("내 차의 모델은 " + tesla.model + "이고 " + "색은 " + tesla.color + "입니다."); // 필드(멤버 변수) 호출
        tesla.power(); // 메서드 호출
        tesla.accelerate();
        tesla.stop();

        Car bmw = new Car("d520i"); //매개변수가 1개인 생성자 호출
        System.out.println("내 차의 모델은 " + bmw.model + "이고 " + "색은 " + bmw.color + "입니다."); // 필드(멤버 변수) 호출
        bmw.power();
        bmw.accelerate();
        bmw.stop();

        Car audi = new Car(); //매개변수가 없는 생성자 호출
        System.out.println("내 차의 모델은 " + audi.model + "이고 " + "색은 " + audi.color + "입니다."); // 필드(멤버 변수) 호출
        audi.power();
        audi.accelerate();
        audi.stop();
    }
}
