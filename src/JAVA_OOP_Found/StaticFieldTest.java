package JAVA_OOP_Found;

public class StaticFieldTest {
    public static void main(String[] args){
        StaticField staticField1 = new StaticField();
        StaticField staticField2 = new StaticField();

        staticField1.num1 = 100; //인스턴스 변수 할당
        staticField2.num1 = 1000;

        System.out.println(staticField1.num1); //인스턴스 변수 출력
        System.out.println(staticField2.num1);

        staticField1.num2 = 150;
        staticField2.num2 = 1500;

        System.out.println(staticField1.num2); //클래스 변수 출력
        System.out.println(staticField2.num2);
        System.out.println(StaticField.num2);
    }
}
