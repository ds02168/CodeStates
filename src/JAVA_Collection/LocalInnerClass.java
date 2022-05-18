package JAVA_Collection;

class Outer3{
    int num = 3;
    void test() {
        int num2 = 6;
        class LocalInClass{
            void getPrint(){
                System.out.println(num);
                System.out.println(num2);
            }
        }
        LocalInClass localInClass = new LocalInClass();
        localInClass.getPrint();
    }
}

public class LocalInnerClass {
    public static void main(String[] args) {
        Outer3 outer = new Outer3();
        outer.test();
    }
}
