package JAVA_OOP_Found;

class Car {
    public String model; // 필드 선언
    public String color;

    public Car(String model, String color) { // 인스턴스 초기화를 위한 생성자 함수. 매개변수에 따라 여러종류로 선언 가능합니다.
        this.model = model; //this.은 필드를 가리킵니다.
        this.color = color; //this.이 없을시 매개변수가 우선시 됩니다.
    }

    public Car(String model){ //매개변수가 1개인 생성자
        this(model,"검정"); //매개변수 2개인 생성자를 호출하면서 기본값으로 색상을 "검정"을 줍니다.
    } //this()는 자신의 생성자를 호출합니다.

    public Car(){ //매개변수가 없는 생성자
        this("A6"); //매개변수 1개인 생성자를 호출하면서 기본값으로 모델을 "model1"을 줍니다.
    }
    void power() { // 메서드 선언
        System.out.println("시동을 걸었습니다.");
    }
    void accelerate() {
        System.out.println("속도를 높입니다.");
    }
    void stop(){
        System.out.println("멈춥니다!");
    }
}