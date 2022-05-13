package JAVA_OOP_Extend;

class Animal{}
class Bat extends Animal{}
class Cat extends Animal{}

public class InstanceOfExample {
    public static void main(String[] args) {
        Animal animal = new Animal();
        System.out.println(animal instanceof Object); //상위 클래스
        System.out.println(animal instanceof Animal); //해당 클래스
        System.out.println(animal instanceof Bat); //하위 클래스

        Animal cat = new Cat(); //업 캐스팅
        System.out.println(cat instanceof Object); //상위 클래스
        System.out.println(cat instanceof Animal); //상위 클래스
        System.out.println(cat instanceof Cat); //해당 클래스
        System.out.println(cat instanceof Bat); //공통된 상위클래스를 둔 또 다른 하위 클래스
    }
}
