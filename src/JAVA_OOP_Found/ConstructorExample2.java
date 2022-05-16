package JAVA_OOP_Found;

public class ConstructorExample2 {
    public static void main(String[] args){
        Car2 c = new Car2("Model x","빨간색",250);
        System.out.println("제 차는 " + c.getModelName() + "이고, 컬러는 "
        + c.getColor() + "입니다.");
    }
}

class Car2{
    private String modelName;
    private String color;
    private int maxSpeed;

    public Car2(String modelName, String color, int maxSpeed){
        this.modelName = modelName;
        this.color = color;
        this.maxSpeed = maxSpeed;
    }

    public String getModelName(){ 
        return modelName;
    }

    public String getColor(){
        return color;
    }
}
