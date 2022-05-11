package JAVA_OOP_Found;

public class ConstructorExample2 {
    public static void main(String[] args){
        Car2 c = new Car2("Model x","빨간색",250);
        //순서대로 매개변수에 modelName, color, maxSpeed를 매개변수 인자로 넘겨줍니다.
        System.out.println("제 차는 " + c.getModelName() + "이고, 컬러는 "
        + c.getColor() + "입니다.");
    }
}

class Car2{
    private String modelName;
    private String color;
    private int maxSpeed;

    public Car2(String modelName, String color, int maxSpeed){ //매개변수 3개 가지는 생성자
        this.modelName = modelName; //this.은 자기자신에 대한 포인터
        this.color = color; //자기자신의 변수, 즉 멤버변수를 가리킵니다.
        this.maxSpeed = maxSpeed;
    }

    public String getModelName(){ //String 데이터 타입을 반환
        return modelName; //mdoelName이 가진 값으로 반환합니다.
    }

    public String getColor(){
        return color;
    }
}