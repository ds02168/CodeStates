package JAVA_OOP_Extend;

class Upper{
    int count = 20;
}

class Lower extends Upper{
    int count = 15;

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
