package JAVA_OOP_Found;

public class Example {
    public Example(){ //기본 생성자
        //this(10); 시 Example(int x)호출
        System.out.println("Example의 기본 생성자 호출!");
    };

    public Example(int x){ //매개변수 1개 생성자
        this(); //기본 생성자 호출(매개 변수로 구분)
        System.out.println("Example의 두 번째 생성자 호출!");
    }
}
