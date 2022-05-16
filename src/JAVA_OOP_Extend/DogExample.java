package JAVA_OOP_Extend;

abstract class Animal2{
    public String kind;
    public abstract void sound();
}

class Dog2 extends Animal2{
    public Dog2(){
        this.kind = "포유류";
    }

    public void sound(){
        System.out.println("멍멍");
    }
}

class Cat2 extends Animal2{
    public Cat2(){
        this.kind = "포유류";
    }

    @Override
    public void sound() {
        System.out.println("야옹");
    }
}

abstract class Bat2 extends Animal2{

}

public class DogExample {
    public static void main(String[] args) {
        Animal2 dog = new Dog2();
        dog.sound();
        Cat2 cat = new Cat2();
        cat.sound();
    }
}
