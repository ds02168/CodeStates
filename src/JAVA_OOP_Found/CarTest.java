package JAVA_OOP_Found;

public class CarTest {
    public static void main(String[] args){
        Car tesla = new Car("Model 3", "빨강");

        System.out.println("내 차의 모델은 " + tesla.model + "이고 " + "색은 " + tesla.color + "입니다.");
        tesla.power();
        tesla.accelerate();
        tesla.stop();

        Car bmw = new Car("d520i");
        System.out.println("내 차의 모델은 " + bmw.model + "이고 " + "색은 " + bmw.color + "입니다.");
        bmw.power();
        bmw.accelerate();
        bmw.stop();

        Car audi = new Car();
        System.out.println("내 차의 모델은 " + audi.model + "이고 " + "색은 " + audi.color + "입니다.");
        audi.power();
        audi.accelerate();
        audi.stop();
    }
}
