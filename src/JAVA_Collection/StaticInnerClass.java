package JAVA_Collection;

class Outer2{
    private int num = 3;
    private static int sNum = 4;

    void getPrint(){
        System.out.println("인스턴스 메서드");
    }
    static void getPrintStatic(){
        System.out.println("스태틱 메서드");
    }
    static class StaticInClass{
        void test(){
            System.out.println("Outer num = " +sNum + "(외부 클래스의 정적 변수)");
            getPrintStatic();
        }
        static void testStatic(){
            System.out.println("스태틱 클래스의 스태틱 메서드");
        }
    }
}

public class StaticInnerClass {
    public static void main(String[] args) {
        Outer2.StaticInClass a = new Outer2.StaticInClass();
        a.test();
        Outer2.StaticInClass.testStatic();
    }
}
