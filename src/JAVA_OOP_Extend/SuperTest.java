package JAVA_OOP_Extend;

class Human{
    Human(){
        System.out.println("휴먼 클래스 생성자");
    }
}

class Student extends Human{
    Student(){
        super();
        System.out.println("학생 클래스 생성자");
    }
}

public class SuperTest {
    public static void main(String[] args) {
        Student s = new Student();
    }
}
