package JAVA_Effective;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.function.IntBinaryOperator;

public class MethodReferences {
    public static void main(String[] args) throws Exception {
        IntBinaryOperator operator; //2개의 매개변수를 가지는 메서드 레퍼런스를 담는 변수

        //static
        operator = Calculator :: staticMethod;
        System.out.println("정적 메서드 결과 : " + operator.applyAsInt(3,5));
        //연산
        //instance
        Calculator calculator = new Calculator();
        operator = calculator::instanceMethod;
        System.out.println("인스턴스 메서드 결과 : " + operator.applyAsInt(3,5));
    }
}
