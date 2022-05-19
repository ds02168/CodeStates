package JAVA_Effective;

import java.util.function.BiFunction;
import java.util.function.Function;

public class ConstructorRef {
    public static void main(String[] args) throws  Exception {
        Function<String, Member> function1 = Member::new;
        Member member1 = function1.apply("코딩자투리");

        BiFunction<String,String,Member> function2 = Member::new;
        Member member2 = function2.apply("코딩자투리", "ds02168");
    }
}
