package JAVA_OOP_Extend.test2;

import JAVA_OOP_Extend.test1.ExampleImp;
//import JAVA_OOP_Extend.test1.*; 는 모든 클래스를 불러옵니다.
public class PackageImp2 {
    public static void main(String[] args) {
        //Import문으로 패키지를 불러왔으므로 클래스명만 명시하면 됩니다.
        ExampleImp example = new ExampleImp();
        example.print();
    }
}
