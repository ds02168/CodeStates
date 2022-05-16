package JAVA_OOP_Found;

public class ConstructorExample {
    public static void main(String[] args){
        Constructor constructor1 = new Constructor();
        Constructor constructor2 = new Constructor("Hello World");
        Constructor constructor3 = new Constructor(5, 10);
    }
}

class Constructor{
    Constructor(){
        System.out.println("1번 생성자");
    }

    Constructor(String str){
        System.out.println("2번 생성자");
    }

    Constructor(int a, int b){
        System.out.println("3번 생성자");
    }
}
