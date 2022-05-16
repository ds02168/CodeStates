package JAVA_OOP_Found;

class Car {
    public String model; 
    public String color;

    public Car(String model, String color) {
        this.model = model;
        this.color = color;
    }

    public Car(String model){
        this(model,"검정");
    }

    public Car(){
        this("A8");
    }
    void power() {
        System.out.println("시동을 걸었습니다.");
    }
    void accelerate() {
        System.out.println("속도를 높입니다.");
    }
    void stop(){
        System.out.println("멈춥니다!");
    }
}
