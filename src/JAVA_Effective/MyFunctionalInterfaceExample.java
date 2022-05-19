package JAVA_Effective;

@FunctionalInterface
interface MyFunctionalInterface{
    public abstract void accept();
}

public class MyFunctionalInterfaceExample {
    public static void main(String[] args) {
        MyFunctionalInterface example;
        example = () -> {
            String str = "Calling Method First";
            System.out.println(str);
        };
        example.accept();

        example = () -> System.out.println("Calling method, Second");
        example.accept();
    }
}
