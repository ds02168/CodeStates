package JAVA_OOP_Extend;

class Upper{ //상위 클래스
    int count = 20; //super.count
}

class Lower extends Upper{ //하위 클래스
    int count = 15; //this.count

    void callNum(){
        System.out.println("count = " + count);
        System.out.println("this.count = " + this.count);
        System.out.println("super.count = " + super.count);
    }
}

public class Super {
    public static void main(String[] args) {
        Lower lower = new Lower();
        lower.callNum();
    }
}
