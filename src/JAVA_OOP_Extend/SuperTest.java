package JAVA_OOP_Extend;

class Human{ //상위 클래스
    Human(){ //super()
        System.out.println("휴먼 클래스 생성자");
    }
}

class Student extends Human{ //하위 클래스
    Student(){ //this()
        super(); //Human() 으로
        System.out.println("학생 클래스 생성자");
    }
}

public class SuperTest {
    public static void main(String[] args) {
        Student s = new Student();
    }
}
