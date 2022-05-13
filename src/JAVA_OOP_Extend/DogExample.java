package JAVA_OOP_Extend;

abstract class Animal2{ //추상 클래스
    public String kind;
    public abstract void sound(); //추상 메서드
}

class Dog2 extends Animal2{ //하위 클래스
    public Dog2(){
        this.kind = "포유류";
    }

    public void sound(){ //추상 메서드 오버라이딩
        System.out.println("멍멍");
    }
}

class Cat2 extends Animal2{ //하위 클래스
    public Cat2(){
        this.kind = "포유류";
    }

    @Override
    public void sound() { //추상 메서드 오버라이딩
        System.out.println("야옹");
    }
}

abstract class Bat2 extends Animal2{ //추상 클래스
    //추상 클래스를 상속 받은 클래스는 추상메서드를 모두 구현하지 않으면 추상 클래스 입니다.
}

public class DogExample {
    public static void main(String[] args) {
        Animal2 dog = new Dog2(); //업캐스팅
        dog.sound();
        //Bat2 bat = new Bat2(); //추상클래스는 인스턴스화x
        Cat2 cat = new Cat2();
        cat.sound();
    }
}
