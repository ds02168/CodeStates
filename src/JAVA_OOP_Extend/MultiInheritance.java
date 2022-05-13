package JAVA_OOP_Extend;

abstract class Animal3 {public abstract void cry();} //추상 클래스
interface Pet { void play();} //public abstract 생략

class Dog3 extends Animal3 implements Pet{ //Animal3 상속, Pet 인터페이스 구현
    public void cry(){ //Animal3
        System.out.println("야옹");
    }

    public void play(){ //Pet
        System.out.println("원반 던지기");
    }
}

class Cat3 extends Animal3 implements Pet{ //Animal3 상속, Pet 인터페이스 구현
    public void cry(){ //Animal3
        System.out.println("야옹~!");
    }

    public void play(){ //Pet
        System.out.println("쥐 잡기");
    }
}
public class MultiInheritance {
    public static void main(String[] args) {
        Dog3 dog = new Dog3();
        Cat3 cat = new Cat3();

        dog.cry();
        dog.play();
        cat.cry();
        cat.play();
    }
}
