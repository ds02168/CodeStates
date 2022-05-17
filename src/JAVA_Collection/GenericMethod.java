package JAVA_Collection;

class TestClass{
    public <T> T accept(T t){
        return t;
    }
    public <K,V> void getPrint(K k,V v){
        System.out.println(k + " : " + v);
    }
}

public class GenericMethod {
    public static void main(String[] args) {
        TestClass testClass = new TestClass();

        String str1 = testClass.<String>accept("코딩 자투리");
        String str2 = testClass.accept("코딩 자투리");

        System.out.println(str1);
        System.out.println(str2);

        testClass.<String, Integer>getPrint("코딩 자투리",1);
        testClass.getPrint("코딩 자투리",2);
    }
}
