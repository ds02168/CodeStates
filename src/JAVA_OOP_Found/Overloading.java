package JAVA_OOP_Found;

public class Overloading {
    public static void main(String[] args){
        Shape s = new Shape(); //객체 생성

        //메개변수에 따라 다른 메서드가 실행
        s.area(); //(1)
        s.area(5); //(2)
        s.area(10,10); //(3)
        s.area(6.0,12.0); //(4)
    }
}

class Shape{
    public void area(){ //(1)
        System.out.println("넓이");
    }
    public void area(int r){ //(2)
        System.out.println("원 넓이 = " + 3.14 * r * r);
    }
    public void area(int w, int l){ //(3)
        System.out.println("직사각형 넓이 = " + w * l);
    }
    public void area(double b, double h){ //(4)
        System.out.println("삼각형 넓이 = " + 0.5 * b * h);
    }
}
