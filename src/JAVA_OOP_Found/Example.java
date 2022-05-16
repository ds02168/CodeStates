package JAVA_OOP_Found;

public class Example {
    public Example(){
        System.out.println("Example의 기본 생성자 호출!");
    };

    public Example(int x){
        this();
        System.out.println("Example의 두 번째 생성자 호출!");
    }
}
