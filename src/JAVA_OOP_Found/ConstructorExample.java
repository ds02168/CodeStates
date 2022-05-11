package JAVA_OOP_Found;

public class ConstructorExample {
    public static void main(String[] args){
        Constructor constructor1 = new Constructor(); //(1)
        Constructor constructor2 = new Constructor("Hello World"); //(2)
        Constructor constructor3 = new Constructor(5, 10); //(3)
    }
}

class Constructor{
    Constructor(){ //(1)
        System.out.println("1번 생성자");
    }

    Constructor(String str){ //(2)
        System.out.println("2번 생성자");
    }

    Constructor(int a, int b){ //(3)
        System.out.println("3번 생성자");
    }
}
