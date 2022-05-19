package JAVA_Effective;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamLambdaExample {
    public static void main(String[] args) {
        List<Student> list = Arrays.asList(
                new Student("김코딩",95),
                new Student("이자바",92)
        );

        Stream<Student> stream = list.stream();
        stream.forEach(s -> {
            String name = s.getName();
            int score = s.getScore();
            System.out.println(name + " - " + score);
        });
    }
}
