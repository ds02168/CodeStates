package JAVA_OOP_Extend.test2;

public class PackageImp { //패키지 Import X
    public static void main(String[] args) {
        //패키지명.클래스로 패키지명을 모두 명시해야 합니다.
        JAVA_OOP_Extend.test1.ExampleImp example = new JAVA_OOP_Extend.test1.ExampleImp();
        example.print();
    }
}
