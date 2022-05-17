package JAVA_Collection;

class MyGeneric<T> {
    private T t;
    public T get(){return t;}
    public void set(T t){this.t = t;}
}

public class Collection_init {
    public static void main(String[] args) {
        MyGeneric<String> myGeneric1 = new MyGeneric<>();
        myGeneric1.set("String");
        String str = myGeneric1.get();

        MyGeneric<Integer> myGeneric2 = new MyGeneric<>();
        myGeneric2.set(1);
        int value = myGeneric2.get(); //자동 언박싱
    }
}
