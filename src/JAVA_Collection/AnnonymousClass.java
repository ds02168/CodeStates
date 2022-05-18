package JAVA_Collection;

interface Name{
    public static final String name = "코딩 자투리";
    public abstract void getName();
}

class TestClass2 implements Name{
    public void getName(){
        System.out.println("내 이름은 " + name);
    }
}

public class AnnonymousClass {
    public static void main(String[] args) {
        TestClass2 outer = new TestClass2();
        outer.getName();

        new Name(){
            public void getName(){
                System.out.println("내 이름은 " + name);
            }
        }.getName();
    }
}
